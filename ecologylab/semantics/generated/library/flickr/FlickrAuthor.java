package ecologylab.semantics.generated.library.flickr;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.artwork.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.camera.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.googleBooks.*;
import ecologylab.semantics.generated.library.gps.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.products.*;
import ecologylab.semantics.generated.library.publication.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.scienceDirect.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.ClippableDocument;
import ecologylab.semantics.metadata.builtins.Clipping;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.ImageClipping;
import ecologylab.semantics.metadata.builtins.MediaClipping;
import ecologylab.semantics.metadata.builtins.TextClipping;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.tools.MetaMetadataCompilerUtils;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	All flickr photos of a particular user

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class FlickrAuthor
extends CompoundDocument
{


/**
	Collection of all images of a user
*/
@simpl_collection("flickr_link") @xml_tag("flickr_link_set") @mm_name("flickr_link_set")
private ArrayList<FlickrLink>	flickrLinkSet;



/**
	Constructor
*/
public FlickrAuthor()
{
 super();
}

/**
	Constructor
*/
public FlickrAuthor(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for flickrLinkSet
*/
public ArrayList<FlickrLink>	flickrLinkSet()
{
	ArrayList<FlickrLink>	result = this.flickrLinkSet;
	if (result == null)
	{
		result = new ArrayList<FlickrLink>();
		this.flickrLinkSet = result;
	}
	return result;
}

/**
	Get the value of field flickrLinkSet
*/
public ArrayList<FlickrLink> getFlickrLinkSet()
{
	return this.flickrLinkSet;
}

/**
	Set the value of field flickrLinkSet
*/
public void setFlickrLinkSet(ArrayList<FlickrLink> flickrLinkSet)
{
	this.flickrLinkSet = flickrLinkSet;
}


}

