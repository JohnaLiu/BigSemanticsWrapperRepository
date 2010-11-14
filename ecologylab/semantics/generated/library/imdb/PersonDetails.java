package ecologylab.semantics.generated.library.imdb;

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


/**
	IMDB metadata
**/ 

@simpl_inherit

public class  PersonDetails
extends  Document
{

	@simpl_scalar private MetadataParsedURL	personImg;

private  @simpl_composite @mm_name("birth_detail") BirthDetail	birthDetail;	@simpl_scalar private MetadataString	miniBiography;
	@simpl_scalar private MetadataParsedURL	biographyLink;
	 @simpl_collection("imdb_title") @xml_tag("titles_as_actor") @mm_name("titles_as_actor") private ArrayList<Entity<ImdbTitle>>	titlesAsActor;
	 @simpl_collection("imdb_title") @xml_tag("titles_as_director") @mm_name("titles_as_director") private ArrayList<Entity<ImdbTitle>>	titlesAsDirector;
	 @simpl_collection("imdb_title") @xml_tag("titles_for_soundtrack") @mm_name("titles_for_soundtrack") private ArrayList<Entity<ImdbTitle>>	titlesForSoundtrack;
	 @simpl_collection("imdb_title") @xml_tag("titles_as_producer") @mm_name("titles_as_producer") private ArrayList<Entity<ImdbTitle>>	titlesAsProducer;
	 @simpl_collection("imdb_title") @xml_tag("titles_thanked_in") @mm_name("titles_thanked_in") private ArrayList<Entity<ImdbTitle>>	titlesThankedIn;
	 @simpl_collection("imdb_title") @xml_tag("titles_as_self") @mm_name("titles_as_self") private ArrayList<Entity<ImdbTitle>>	titlesAsSelf;

/**
	Constructor
**/ 

public PersonDetails()
{
 super();
}

/**
	Constructor
**/ 

public PersonDetails(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for personImg
**/ 

public MetadataParsedURL	personImg()
{
MetadataParsedURL	result	=this.personImg;
if(result == null)
{
result = new MetadataParsedURL();
this.personImg	=	 result;
}
return result;
}

/**
	Gets the value of the field personImg
**/ 

public ParsedURL getPersonImg()
{
	return personImg().getValue();
}

/**
	Sets the value of the field personImg
**/ 

public void setPersonImg( ParsedURL personImg )
{
	this.personImg().setValue(personImg);
}

/**
	The heavy weight setter method for field personImg
**/ 

public void hwSetPersonImg( ParsedURL personImg )
{
	this.personImg().setValue(personImg);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: personImg
**/ 

public boolean isNullPersonImg()
{
	return personImg == null || personImg.getValue() == null;
}

/**
	 Sets the personImg directly
**/ 

public void setPersonImgMetadata(MetadataParsedURL personImg)
{	this.personImg = personImg;
}
/**
	Heavy Weight Direct setter method for personImg
**/ 

public void hwSetPersonImgMetadata(MetadataParsedURL personImg)
{	 if(this.personImg!=null && this.personImg.getValue()!=null && hasTermVector())
		 termVector().remove(this.personImg.termVector());
	 this.personImg = personImg;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for birthDetail
**/ 

public BirthDetail	birthDetail()
{
BirthDetail	result	=this.birthDetail;
if(result == null)
{
result = new BirthDetail();
this.birthDetail	=	 result;
}
return result;
}

/**
	Set the value of field birthDetail
**/ 

public void setBirthDetail( BirthDetail birthDetail )
{
this.birthDetail = birthDetail ;
}

/**
	Get the value of field birthDetail
**/ 

public BirthDetail getBirthDetail(){
return this.birthDetail;
}

/**
	Lazy Evaluation for miniBiography
**/ 

public MetadataString	miniBiography()
{
MetadataString	result	=this.miniBiography;
if(result == null)
{
result = new MetadataString();
this.miniBiography	=	 result;
}
return result;
}

/**
	Gets the value of the field miniBiography
**/ 

public String getMiniBiography()
{
	return miniBiography().getValue();
}

/**
	Sets the value of the field miniBiography
**/ 

public void setMiniBiography( String miniBiography )
{
	this.miniBiography().setValue(miniBiography);
}

/**
	The heavy weight setter method for field miniBiography
**/ 

public void hwSetMiniBiography( String miniBiography )
{
	this.miniBiography().setValue(miniBiography);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: miniBiography
**/ 

public boolean isNullMiniBiography()
{
	return miniBiography == null || miniBiography.getValue() == null;
}

/**
	 Sets the miniBiography directly
**/ 

public void setMiniBiographyMetadata(MetadataString miniBiography)
{	this.miniBiography = miniBiography;
}
/**
	Heavy Weight Direct setter method for miniBiography
**/ 

public void hwSetMiniBiographyMetadata(MetadataString miniBiography)
{	 if(this.miniBiography!=null && this.miniBiography.getValue()!=null && hasTermVector())
		 termVector().remove(this.miniBiography.termVector());
	 this.miniBiography = miniBiography;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for biographyLink
**/ 

public MetadataParsedURL	biographyLink()
{
MetadataParsedURL	result	=this.biographyLink;
if(result == null)
{
result = new MetadataParsedURL();
this.biographyLink	=	 result;
}
return result;
}

/**
	Gets the value of the field biographyLink
**/ 

public ParsedURL getBiographyLink()
{
	return biographyLink().getValue();
}

/**
	Sets the value of the field biographyLink
**/ 

public void setBiographyLink( ParsedURL biographyLink )
{
	this.biographyLink().setValue(biographyLink);
}

/**
	The heavy weight setter method for field biographyLink
**/ 

public void hwSetBiographyLink( ParsedURL biographyLink )
{
	this.biographyLink().setValue(biographyLink);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: biographyLink
**/ 

public boolean isNullBiographyLink()
{
	return biographyLink == null || biographyLink.getValue() == null;
}

/**
	 Sets the biographyLink directly
**/ 

public void setBiographyLinkMetadata(MetadataParsedURL biographyLink)
{	this.biographyLink = biographyLink;
}
/**
	Heavy Weight Direct setter method for biographyLink
**/ 

public void hwSetBiographyLinkMetadata(MetadataParsedURL biographyLink)
{	 if(this.biographyLink!=null && this.biographyLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.biographyLink.termVector());
	 this.biographyLink = biographyLink;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for titlesAsActor
**/ 

public  ArrayList<Entity<ImdbTitle>>	titlesAsActor()
{
 ArrayList<Entity<ImdbTitle>>	result	=this.titlesAsActor;
if(result == null)
{
result = new  ArrayList<Entity<ImdbTitle>>();
this.titlesAsActor	=	 result;
}
return result;
}

/**
	Set the value of field titlesAsActor
**/ 

public void setTitlesAsActor(  ArrayList<Entity<ImdbTitle>> titlesAsActor )
{
this.titlesAsActor = titlesAsActor ;
}

/**
	Get the value of field titlesAsActor
**/ 

public  ArrayList<Entity<ImdbTitle>> getTitlesAsActor(){
return this.titlesAsActor;
}

/**
	Lazy Evaluation for titlesAsDirector
**/ 

public  ArrayList<Entity<ImdbTitle>>	titlesAsDirector()
{
 ArrayList<Entity<ImdbTitle>>	result	=this.titlesAsDirector;
if(result == null)
{
result = new  ArrayList<Entity<ImdbTitle>>();
this.titlesAsDirector	=	 result;
}
return result;
}

/**
	Set the value of field titlesAsDirector
**/ 

public void setTitlesAsDirector(  ArrayList<Entity<ImdbTitle>> titlesAsDirector )
{
this.titlesAsDirector = titlesAsDirector ;
}

/**
	Get the value of field titlesAsDirector
**/ 

public  ArrayList<Entity<ImdbTitle>> getTitlesAsDirector(){
return this.titlesAsDirector;
}

/**
	Lazy Evaluation for titlesForSoundtrack
**/ 

public  ArrayList<Entity<ImdbTitle>>	titlesForSoundtrack()
{
 ArrayList<Entity<ImdbTitle>>	result	=this.titlesForSoundtrack;
if(result == null)
{
result = new  ArrayList<Entity<ImdbTitle>>();
this.titlesForSoundtrack	=	 result;
}
return result;
}

/**
	Set the value of field titlesForSoundtrack
**/ 

public void setTitlesForSoundtrack(  ArrayList<Entity<ImdbTitle>> titlesForSoundtrack )
{
this.titlesForSoundtrack = titlesForSoundtrack ;
}

/**
	Get the value of field titlesForSoundtrack
**/ 

public  ArrayList<Entity<ImdbTitle>> getTitlesForSoundtrack(){
return this.titlesForSoundtrack;
}

/**
	Lazy Evaluation for titlesAsProducer
**/ 

public  ArrayList<Entity<ImdbTitle>>	titlesAsProducer()
{
 ArrayList<Entity<ImdbTitle>>	result	=this.titlesAsProducer;
if(result == null)
{
result = new  ArrayList<Entity<ImdbTitle>>();
this.titlesAsProducer	=	 result;
}
return result;
}

/**
	Set the value of field titlesAsProducer
**/ 

public void setTitlesAsProducer(  ArrayList<Entity<ImdbTitle>> titlesAsProducer )
{
this.titlesAsProducer = titlesAsProducer ;
}

/**
	Get the value of field titlesAsProducer
**/ 

public  ArrayList<Entity<ImdbTitle>> getTitlesAsProducer(){
return this.titlesAsProducer;
}

/**
	Lazy Evaluation for titlesThankedIn
**/ 

public  ArrayList<Entity<ImdbTitle>>	titlesThankedIn()
{
 ArrayList<Entity<ImdbTitle>>	result	=this.titlesThankedIn;
if(result == null)
{
result = new  ArrayList<Entity<ImdbTitle>>();
this.titlesThankedIn	=	 result;
}
return result;
}

/**
	Set the value of field titlesThankedIn
**/ 

public void setTitlesThankedIn(  ArrayList<Entity<ImdbTitle>> titlesThankedIn )
{
this.titlesThankedIn = titlesThankedIn ;
}

/**
	Get the value of field titlesThankedIn
**/ 

public  ArrayList<Entity<ImdbTitle>> getTitlesThankedIn(){
return this.titlesThankedIn;
}

/**
	Lazy Evaluation for titlesAsSelf
**/ 

public  ArrayList<Entity<ImdbTitle>>	titlesAsSelf()
{
 ArrayList<Entity<ImdbTitle>>	result	=this.titlesAsSelf;
if(result == null)
{
result = new  ArrayList<Entity<ImdbTitle>>();
this.titlesAsSelf	=	 result;
}
return result;
}

/**
	Set the value of field titlesAsSelf
**/ 

public void setTitlesAsSelf(  ArrayList<Entity<ImdbTitle>> titlesAsSelf )
{
this.titlesAsSelf = titlesAsSelf ;
}

/**
	Get the value of field titlesAsSelf
**/ 

public  ArrayList<Entity<ImdbTitle>> getTitlesAsSelf(){
return this.titlesAsSelf;
}

}

