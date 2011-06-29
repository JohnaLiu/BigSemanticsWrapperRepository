package ecologylab.semantics.generated.library.imdb;


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
	IMDB metadata

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class PersonDetails
extends CompoundDocument
{

@simpl_scalar
private MetadataParsedURL	personImg;

@simpl_composite @mm_name("birth_detail")
private BirthDetail	birthDetail;

@simpl_scalar
private MetadataString	miniBiography;

@simpl_scalar
private MetadataParsedURL	biographyLink;

@simpl_collection("imdb_title") @xml_tag("titles_as_actor") @mm_name("titles_as_actor")
private ArrayList<ImdbTitle>	titlesAsActor;

@simpl_collection("imdb_title") @xml_tag("titles_as_actress") @mm_name("titles_as_actress")
private ArrayList<ImdbTitle>	titlesAsActress;

@simpl_collection("imdb_title") @xml_tag("titles_as_director") @mm_name("titles_as_director")
private ArrayList<ImdbTitle>	titlesAsDirector;

@simpl_collection("imdb_title") @xml_tag("titles_for_soundtrack") @mm_name("titles_for_soundtrack")
private ArrayList<ImdbTitle>	titlesForSoundtrack;

@simpl_collection("imdb_title") @xml_tag("titles_as_producer") @mm_name("titles_as_producer")
private ArrayList<ImdbTitle>	titlesAsProducer;

@simpl_collection("imdb_title") @xml_tag("titles_thanked_in") @mm_name("titles_thanked_in")
private ArrayList<ImdbTitle>	titlesThankedIn;

@simpl_collection("imdb_title") @xml_tag("titles_as_self") @mm_name("titles_as_self")
private ArrayList<ImdbTitle>	titlesAsSelf;



/**
	Constructor
*/
public PersonDetails()
{
 super();
}

/**
	Constructor
*/
public PersonDetails(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for personImg
*/
public MetadataParsedURL	personImg()
{
	MetadataParsedURL	result = this.personImg;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.personImg = result;
	}
	return result;
}

/**
	Gets the value of the field personImg
*/
public ParsedURL getPersonImg()
{
	return this.personImg().getValue();
}

/**
	Sets the value of the field personImg
*/
public void setPersonImg(ParsedURL personImg)
{
	this.personImg().setValue(personImg);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: personImg
*/
public boolean isNullPersonImg()
{
	return personImg == null || personImg.getValue() == null;
}

/**
	The heavy weight setter method for field personImg
*/
public void hwSetPersonImg(ParsedURL personImg)
{
	this.personImg().setValue(personImg);
	rebuildCompositeTermVector();
}

/**
	 Sets the personImg directly.
*/
public void setPersonImgMetadata(MetadataParsedURL personImg)
{
	this.personImg = personImg;
}

/**
	Heavy Weight Direct setter method for personImg
*/
public void hwSetPersonImgMetadata(MetadataParsedURL personImg)
{
	if (this.personImg != null && this.personImg.getValue() != null && hasTermVector())
		termVector().remove(this.personImg.termVector());
	this.personImg = personImg;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for birthDetail
*/
public BirthDetail	birthDetail()
{
	BirthDetail	result = this.birthDetail;
	if (result == null)
	{
		result = new BirthDetail();
		this.birthDetail = result;
	}
	return result;
}

/**
	Get the value of field birthDetail
*/
public BirthDetail getBirthDetail()
{
	return this.birthDetail;
}

/**
	Set the value of field birthDetail
*/
public void setBirthDetail(BirthDetail birthDetail)
{
	this.birthDetail = birthDetail;
}

/**
	Lazy evaluation for miniBiography
*/
public MetadataString	miniBiography()
{
	MetadataString	result = this.miniBiography;
	if (result == null)
	{
		result = new MetadataString();
		this.miniBiography = result;
	}
	return result;
}

/**
	Gets the value of the field miniBiography
*/
public String getMiniBiography()
{
	return this.miniBiography().getValue();
}

/**
	Sets the value of the field miniBiography
*/
public void setMiniBiography(String miniBiography)
{
	this.miniBiography().setValue(miniBiography);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: miniBiography
*/
public boolean isNullMiniBiography()
{
	return miniBiography == null || miniBiography.getValue() == null;
}

/**
	The heavy weight setter method for field miniBiography
*/
public void hwSetMiniBiography(String miniBiography)
{
	this.miniBiography().setValue(miniBiography);
	rebuildCompositeTermVector();
}

/**
	 Sets the miniBiography directly.
*/
public void setMiniBiographyMetadata(MetadataString miniBiography)
{
	this.miniBiography = miniBiography;
}

/**
	Heavy Weight Direct setter method for miniBiography
*/
public void hwSetMiniBiographyMetadata(MetadataString miniBiography)
{
	if (this.miniBiography != null && this.miniBiography.getValue() != null && hasTermVector())
		termVector().remove(this.miniBiography.termVector());
	this.miniBiography = miniBiography;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for biographyLink
*/
public MetadataParsedURL	biographyLink()
{
	MetadataParsedURL	result = this.biographyLink;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.biographyLink = result;
	}
	return result;
}

/**
	Gets the value of the field biographyLink
*/
public ParsedURL getBiographyLink()
{
	return this.biographyLink().getValue();
}

/**
	Sets the value of the field biographyLink
*/
public void setBiographyLink(ParsedURL biographyLink)
{
	this.biographyLink().setValue(biographyLink);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: biographyLink
*/
public boolean isNullBiographyLink()
{
	return biographyLink == null || biographyLink.getValue() == null;
}

/**
	The heavy weight setter method for field biographyLink
*/
public void hwSetBiographyLink(ParsedURL biographyLink)
{
	this.biographyLink().setValue(biographyLink);
	rebuildCompositeTermVector();
}

/**
	 Sets the biographyLink directly.
*/
public void setBiographyLinkMetadata(MetadataParsedURL biographyLink)
{
	this.biographyLink = biographyLink;
}

/**
	Heavy Weight Direct setter method for biographyLink
*/
public void hwSetBiographyLinkMetadata(MetadataParsedURL biographyLink)
{
	if (this.biographyLink != null && this.biographyLink.getValue() != null && hasTermVector())
		termVector().remove(this.biographyLink.termVector());
	this.biographyLink = biographyLink;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for titlesAsActor
*/
public ArrayList<ImdbTitle>	titlesAsActor()
{
	ArrayList<ImdbTitle>	result = this.titlesAsActor;
	if (result == null)
	{
		result = new ArrayList<ImdbTitle>();
		this.titlesAsActor = result;
	}
	return result;
}

/**
	Get the value of field titlesAsActor
*/
public ArrayList<ImdbTitle> getTitlesAsActor()
{
	return this.titlesAsActor;
}

/**
	Set the value of field titlesAsActor
*/
public void setTitlesAsActor(ArrayList<ImdbTitle> titlesAsActor)
{
	this.titlesAsActor = titlesAsActor;
}

/**
	Lazy evaluation for titlesAsActress
*/
public ArrayList<ImdbTitle>	titlesAsActress()
{
	ArrayList<ImdbTitle>	result = this.titlesAsActress;
	if (result == null)
	{
		result = new ArrayList<ImdbTitle>();
		this.titlesAsActress = result;
	}
	return result;
}

/**
	Get the value of field titlesAsActress
*/
public ArrayList<ImdbTitle> getTitlesAsActress()
{
	return this.titlesAsActress;
}

/**
	Set the value of field titlesAsActress
*/
public void setTitlesAsActress(ArrayList<ImdbTitle> titlesAsActress)
{
	this.titlesAsActress = titlesAsActress;
}

/**
	Lazy evaluation for titlesAsDirector
*/
public ArrayList<ImdbTitle>	titlesAsDirector()
{
	ArrayList<ImdbTitle>	result = this.titlesAsDirector;
	if (result == null)
	{
		result = new ArrayList<ImdbTitle>();
		this.titlesAsDirector = result;
	}
	return result;
}

/**
	Get the value of field titlesAsDirector
*/
public ArrayList<ImdbTitle> getTitlesAsDirector()
{
	return this.titlesAsDirector;
}

/**
	Set the value of field titlesAsDirector
*/
public void setTitlesAsDirector(ArrayList<ImdbTitle> titlesAsDirector)
{
	this.titlesAsDirector = titlesAsDirector;
}

/**
	Lazy evaluation for titlesForSoundtrack
*/
public ArrayList<ImdbTitle>	titlesForSoundtrack()
{
	ArrayList<ImdbTitle>	result = this.titlesForSoundtrack;
	if (result == null)
	{
		result = new ArrayList<ImdbTitle>();
		this.titlesForSoundtrack = result;
	}
	return result;
}

/**
	Get the value of field titlesForSoundtrack
*/
public ArrayList<ImdbTitle> getTitlesForSoundtrack()
{
	return this.titlesForSoundtrack;
}

/**
	Set the value of field titlesForSoundtrack
*/
public void setTitlesForSoundtrack(ArrayList<ImdbTitle> titlesForSoundtrack)
{
	this.titlesForSoundtrack = titlesForSoundtrack;
}

/**
	Lazy evaluation for titlesAsProducer
*/
public ArrayList<ImdbTitle>	titlesAsProducer()
{
	ArrayList<ImdbTitle>	result = this.titlesAsProducer;
	if (result == null)
	{
		result = new ArrayList<ImdbTitle>();
		this.titlesAsProducer = result;
	}
	return result;
}

/**
	Get the value of field titlesAsProducer
*/
public ArrayList<ImdbTitle> getTitlesAsProducer()
{
	return this.titlesAsProducer;
}

/**
	Set the value of field titlesAsProducer
*/
public void setTitlesAsProducer(ArrayList<ImdbTitle> titlesAsProducer)
{
	this.titlesAsProducer = titlesAsProducer;
}

/**
	Lazy evaluation for titlesThankedIn
*/
public ArrayList<ImdbTitle>	titlesThankedIn()
{
	ArrayList<ImdbTitle>	result = this.titlesThankedIn;
	if (result == null)
	{
		result = new ArrayList<ImdbTitle>();
		this.titlesThankedIn = result;
	}
	return result;
}

/**
	Get the value of field titlesThankedIn
*/
public ArrayList<ImdbTitle> getTitlesThankedIn()
{
	return this.titlesThankedIn;
}

/**
	Set the value of field titlesThankedIn
*/
public void setTitlesThankedIn(ArrayList<ImdbTitle> titlesThankedIn)
{
	this.titlesThankedIn = titlesThankedIn;
}

/**
	Lazy evaluation for titlesAsSelf
*/
public ArrayList<ImdbTitle>	titlesAsSelf()
{
	ArrayList<ImdbTitle>	result = this.titlesAsSelf;
	if (result == null)
	{
		result = new ArrayList<ImdbTitle>();
		this.titlesAsSelf = result;
	}
	return result;
}

/**
	Get the value of field titlesAsSelf
*/
public ArrayList<ImdbTitle> getTitlesAsSelf()
{
	return this.titlesAsSelf;
}

/**
	Set the value of field titlesAsSelf
*/
public void setTitlesAsSelf(ArrayList<ImdbTitle> titlesAsSelf)
{
	this.titlesAsSelf = titlesAsSelf;
}


}

