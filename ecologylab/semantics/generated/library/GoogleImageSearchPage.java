package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	Google image search page
**/ 

@simpl_inherit

public class  GoogleImageSearchPage
extends  GoogleImageSearchType
{

	@simpl_collection("image_result") private ArrayList<ImageResult>	imageResults;

/**
	Constructor
**/ 

public GoogleImageSearchPage()
{
 super();
}

/**
	Constructor
**/ 

public GoogleImageSearchPage(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for imageResults
**/ 

public  ArrayList<ImageResult>	imageResults()
{
 ArrayList<ImageResult>	result	=this.imageResults;
if(result == null)
{
result = new  ArrayList<ImageResult>();
this.imageResults	=	 result;
}
return result;
}

/**
	Set the value of field imageResults
**/ 

public void setImageResults(  ArrayList<ImageResult> imageResults )
{
this.imageResults = imageResults ;
}

/**
	Get the value of field imageResults
**/ 

public  ArrayList<ImageResult> getImageResults(){
return this.imageResults;
}

}

