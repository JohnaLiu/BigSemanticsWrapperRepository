package ecologylab.semantics.generated.library.search;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.dreamHouse.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.products.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.ClippableDocument;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Surrogate;
import ecologylab.semantics.metadata.builtins.Text;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;

@simpl_inherit
@xml_tag("SearchResponse")
public class  BingSearch
extends  Document
{


private @xml_tag("web:Web") @simpl_composite @mm_name("web_section") BingSearchWebSection	webSection;
private @xml_tag("mms:Image") @simpl_composite @mm_name("image_section") BingSearchImageSection	imageSection;
/**
	Constructor
**/ 

public BingSearch()
{
 super();
}

/**
	Constructor
**/ 

public BingSearch(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for webSection
**/ 

public BingSearchWebSection	webSection()
{
BingSearchWebSection	result	=this.webSection;
if(result == null)
{
result = new BingSearchWebSection();
this.webSection	=	 result;
}
return result;
}

/**
	Set the value of field webSection
**/ 

public void setWebSection( BingSearchWebSection webSection )
{
this.webSection = webSection ;
}

/**
	Get the value of field webSection
**/ 

public BingSearchWebSection getWebSection(){
return this.webSection;
}

/**
	Lazy Evaluation for imageSection
**/ 

public BingSearchImageSection	imageSection()
{
BingSearchImageSection	result	=this.imageSection;
if(result == null)
{
result = new BingSearchImageSection();
this.imageSection	=	 result;
}
return result;
}

/**
	Set the value of field imageSection
**/ 

public void setImageSection( BingSearchImageSection imageSection )
{
this.imageSection = imageSection ;
}

/**
	Get the value of field imageSection
**/ 

public BingSearchImageSection getImageSection(){
return this.imageSection;
}

}

