package ecologylab.semantics.generated.library.flickr;

import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.generated.library.flickr.FlickrLink;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.semantics.generated.library.search.Search;

/**
*  FlickrTagsInteresting.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/20/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Used for flickr search results
 */ 
@simpl_inherit
public class FlickrTagsInteresting extends Search
{
	/** 
	 * Collection of all images of a user
	 */ 
	@simpl_collection("flickr_link")	@mm_name("flickr_link_set")
	private List<FlickrLink> flickrLinkSet;

	public FlickrTagsInteresting()
	{ }

	public FlickrTagsInteresting(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<FlickrLink> getFlickrLinkSet()
	{
		return flickrLinkSet;
	}

	public void setFlickrLinkSet(List<FlickrLink> flickrLinkSet)
	{
		this.flickrLinkSet = flickrLinkSet;
	}
}
