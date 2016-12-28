
function SetMenu()
{

//	All of the string variables below are being passed as regular expressions so they will
//	not have problems when being passed to a search function (which takes regular expressions).

	topMenuItem = false;
	foundHREF = false;
	var sbookmark = /#/;
	var sparmlist = /\?/;
	var sFileExt1 = /\.htm/;
	var sFileExt2 = /\.html/;
	var sFileExt3 = /\.asp/;

	CheckSix = false;
	
	// Change WDB 
	// vars used to handle a URL with a query (?)
	// The whole algorithm to find out which menu item should be highlighted
	// is executed twice; once for the URL with the query, once without
	
	var iNumberOfTries = 1
	var iTries
	
if (document.all.L2)

// L2 is the name of the level 2 breadcrumb "L2" on level 3...n pages. 
// if it exists, match on the breadcrumb url
{
	s = document.all.L2.href;
}

else

// If  L2 does not exist, work with the current url.
{	
	s = document.URL;

	//  Check for bookmark in url, and strip out the bookmark name

	t = s.search(sbookmark);
	if (t != -1)
	{
		s = (s.substring(0,t));
	} 

	//  Check for a parameter in url, and strip out any parmlist

	t = s.search(sparmlist);
	if (t != -1)
	{
		// if there is a query, try twice
		// Once with the query string, once without
		iNumberOfTries = 2
	} 

}
for (iTries=0;iTries<iNumberOfTries;iTries++) 
{
	if (iTries==1) 
	{
		// the second time, strip the query
		t = s.search(sparmlist);
		if (t != -1)
		{
			s = (s.substring(0,t));
		} 
	}
//
//	search the URL for a file extension
//
sURL = s;
FoundFileExt = (sURL.search(sFileExt1) >= 0) || (sURL.search(sFileExt2) >= 0) || (sURL.search(sFileExt3) >= 0);

//
// Create an array of all anchor tags on the page and loop through it to match to the url.
//
	a = document.links;

Outerloop:
	for (i=0;i<a.length;i++) 
	{
//
//	If there is no file extension on the URL then concatenate the six possible auto loading
//	pages to the URL and check if there is a match under the current url in the array.
//
//	CY (u380176) Dec 13, 2006 - 
//	The unescapes were added to address the issues where '&' would become '%26' and so forth
		if (!FoundFileExt)
		{
		CheckSix = (a[i].href.toLowerCase() == (sURL.toLowerCase() + "default.htm")) ||
				   (a[i].href.toLowerCase() == (sURL.toLowerCase() + "default.html")) ||
				   (a[i].href.toLowerCase() == (sURL.toLowerCase() + "default.asp")) ||
				   (a[i].href.toLowerCase() == (sURL.toLowerCase() + "index.htm")) ||
				   (a[i].href.toLowerCase() == (sURL.toLowerCase() + "index.html")) ||
                                   (a[i].href.toLowerCase() == (sURL.toLowerCase() + "index1.html")) ||
                                   (a[i].href.toLowerCase() == (sURL.toLowerCase() + "index1.xhtml")) ||
                                   (a[i].href.toLowerCase() == (sURL.toLowerCase() + "index2.xhtml")) ||
                                   (a[i].href.toLowerCase() == (sURL.toLowerCase() + "template1.xhtml")) ||
                                   (a[i].href.toLowerCase() == (sURL.toLowerCase() + "template2.xhtml")) ||
				   (a[i].href.toLowerCase() == (sURL.toLowerCase() + "index.asp")) ||
				   (unescape(a[i].href.toLowerCase()) == (unescape(sURL.toLowerCase()) + "default.htm")) ||
				   (unescape(a[i].href.toLowerCase()) == (unescape(sURL.toLowerCase()) + "default.html")) ||
				   (unescape(a[i].href.toLowerCase()) == (unescape(sURL.toLowerCase()) + "default.asp")) ||
				   (unescape(a[i].href.toLowerCase()) == (unescape(sURL.toLowerCase()) + "index.htm")) ||
				   (unescape(a[i].href.toLowerCase()) == (unescape(sURL.toLowerCase()) + "index.html")) ||
                                   (unescape(a[i].href.toLowerCase()) == (unescape(sURL.toLowerCase()) + "index1.html")) ||
                                   (unescape(a[i].href.toLowerCase()) == (unescape(sURL.toLowerCase()) + "index1.xhtml")) ||
                                   (unescape(a[i].href.toLowerCase()) == (unescape(sURL.toLowerCase()) + "index2.xhtml")) ||
                                   (unescape(a[i].href.toLowerCase()) == (unescape(sURL.toLowerCase()) + "template1.xhtml")) ||
                                   (unescape(a[i].href.toLowerCase()) == (unescape(sURL.toLowerCase()) + "template2.xhtml")) ||
				   (unescape(a[i].href.toLowerCase()) == (unescape(sURL.toLowerCase()) + "index.asp"));
		}
		if (a[i].href.toLowerCase() == s.toLowerCase() || CheckSix || unescape(a[i].href.toLowerCase()) == unescape(s.toLowerCase())) 
		{
			j = a[i];
			foundHREF = true;
				
	Innerloop:			
  			for (k=1;k<5;k++)

			{
				j = j.parentElement;
				if (j.tagName == "TR")
				{
					if (j.className == "menuitem") 
					{
						j.className = "menushow";
						j.style.backgroundColor = "black";
						topMenuItem = false;
						break Outerloop;
					}
			 	 else if (j.className == "menuhead")
					{
						j.style.backgroundColor = "white";
						topMenuItem = true;
						break Outerloop;
					}
				}	// this is a table data element	
			}	// inner for loop
		}	// url matches
	}	// outer for loop
	
	
// If no match on href, default the menu to the first top level item, which should be the site home.
// Changed by WDB : only set after the second time in case of a query url
 
if ((!foundHREF && (iNumberOfTries == 1)) || (!foundHREF && (iNumberOfTries == 2) && (iTries == 1) ))

{  // Build an array of all data tags and set the first top level menu item background to white.
	tdTags = document.all.tags("TR");

	for (k=0;k<tdTags.length;k++)
	{
		if (tdTags[k].className == "menuhead")
		{
			tdTags[k].style.backgroundColor = "white"
			topMenuItem = true;
			break;
		}
	}

}

else

{	// Build an array of all data tags for the following logic.

	tdTags = document.all.tags("TR");
}
	
// determine where we left off above (will be represented by k)	
	
for (k=0;k<tdTags.length;k++) 
{
	if (tdTags[k].style.backgroundColor == "white")
	{
		break; 
	}
}	// for loop
	
// if we were inside a menu, let's work backwards and display any other menu section entries

if (!topMenuItem)
{
	for (l=(k-1);l>0;l--)
	{
	if (tdTags[l].className == "menuhead") 
	{
		tdTags[l].style.backgroundColor = "#EEEEEE";					
		break;
	}
	else if (tdTags[l].className == "menuitem") 
		{
			tdTags[l].className = "menushow";
			tdTags[l].style.backgroundColor = "#EEEEEE";
		}
	     else
		{
		// all menu data should be menuitem or menushow -
		// when you hit something else, stop.
		break;		 
		}
	}  // for loop
}  // topMenuItem is false
	
// now let's work forwards - this is the same code whether up above we 
// displayed a menu section head, or a menu section item

for (l=k+1;(l<tdTags.length);l++)
{
	if (tdTags[l].className == "menuhead") 
	{
		break;
	}
  	else if (tdTags[l].className == "menuitem")
	{
		tdTags[l].className = "menushow";
		tdTags[l].style.backgroundColor = "#EEEEEE";					
		topMenuItem = true;
	}
}	// for loop 
} //end of Tries loop

}  // end of function
//-->  