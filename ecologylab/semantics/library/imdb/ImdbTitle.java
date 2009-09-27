package ecologylab.semantics.library.imdb;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.builtins.Entity;

  import java.util.*;
 import ecologylab.semantics.metametadata.MetaMetadata;
  import ecologylab.net.ParsedURL;
 import ecologylab.generic.HashMapArrayList;
 import ecologylab.xml.xml_inherit;
import ecologylab.xml.types.element.Mappable;
import ecologylab.semantics.library.DefaultMetadataTranslationSpace;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.ElementState.xml_tag;
 import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
 import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;


/**
	IMDB metadata
**/ 

@xml_inherit
@xml_tag("imdb_title")
public class  ImdbTitle
extends  Document
{


/**
	Constructor
**/ 

public ImdbTitle()
{
 super();
}

/**
	Constructor
**/ 

public ImdbTitle(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	null
**/ 

	@xml_tag("title") @xml_nested private MetadataString	title;

/**
	Lazy Evaluation for title
**/ 

public MetadataString	title()
{
MetadataString	result	=this.title;
if(result == null)
{
result = new MetadataString();
this.title	=	 result;
}
return result;
}

/**
	Gets the value of the field title
**/ 

public String getTitle(){
return title().getValue();
}

/**
	Sets the value of the field title
**/ 

public void setTitle( String title )
{
this.title().setValue(title);
}

/**
	The heavy weight setter method for field title
**/ 

public void hwSetTitle( String title )
{
this.title().setValue(title);
rebuildCompositeTermVector();
 }
/**
	 Sets the title directly
**/ 

public void setTitleMetadata(MetadataString title)
{	this.title = title;
}
/**
	Heavy Weight Direct setter method for title
**/ 

public void hwSetTitleMetadata(MetadataString title)
{	 if(this.title!=null && this.title.getValue()!=null && hasTermVector())
		 termVector().remove(this.title.termVector());
	 this.title = title;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("rating") @xml_nested private MetadataString	rating;

/**
	Lazy Evaluation for rating
**/ 

public MetadataString	rating()
{
MetadataString	result	=this.rating;
if(result == null)
{
result = new MetadataString();
this.rating	=	 result;
}
return result;
}

/**
	Gets the value of the field rating
**/ 

public String getRating(){
return rating().getValue();
}

/**
	Sets the value of the field rating
**/ 

public void setRating( String rating )
{
this.rating().setValue(rating);
}

/**
	The heavy weight setter method for field rating
**/ 

public void hwSetRating( String rating )
{
this.rating().setValue(rating);
rebuildCompositeTermVector();
 }
/**
	 Sets the rating directly
**/ 

public void setRatingMetadata(MetadataString rating)
{	this.rating = rating;
}
/**
	Heavy Weight Direct setter method for rating
**/ 

public void hwSetRatingMetadata(MetadataString rating)
{	 if(this.rating!=null && this.rating.getValue()!=null && hasTermVector())
		 termVector().remove(this.rating.termVector());
	 this.rating = rating;
	rebuildCompositeTermVector();
}	@xml_collection("directors") private ArrayList<PersonDetails>	directors;

/**
	Lazy Evaluation for directors
**/ 

public  ArrayList<PersonDetails>	directors()
{
 ArrayList<PersonDetails>	result	=this.directors;
if(result == null)
{
result = new  ArrayList<PersonDetails>();
this.directors	=	 result;
}
return result;
}

/**
	Set the value of field directors
**/ 

public void setDirectors(  ArrayList<PersonDetails> directors )
{
this.directors = directors ;
}

/**
	Get the value of field directors
**/ 

public  ArrayList<PersonDetails> getDirectors(){
return this.directors;
}
	@xml_collection("writers") private ArrayList<PersonDetails>	writers;

/**
	Lazy Evaluation for writers
**/ 

public  ArrayList<PersonDetails>	writers()
{
 ArrayList<PersonDetails>	result	=this.writers;
if(result == null)
{
result = new  ArrayList<PersonDetails>();
this.writers	=	 result;
}
return result;
}

/**
	Set the value of field writers
**/ 

public void setWriters(  ArrayList<PersonDetails> writers )
{
this.writers = writers ;
}

/**
	Get the value of field writers
**/ 

public  ArrayList<PersonDetails> getWriters(){
return this.writers;
}

/**
	null
**/ 

	@xml_tag("release_date") @xml_nested private MetadataString	releaseDate;

/**
	Lazy Evaluation for releaseDate
**/ 

public MetadataString	releaseDate()
{
MetadataString	result	=this.releaseDate;
if(result == null)
{
result = new MetadataString();
this.releaseDate	=	 result;
}
return result;
}

/**
	Gets the value of the field releaseDate
**/ 

public String getReleaseDate(){
return releaseDate().getValue();
}

/**
	Sets the value of the field releaseDate
**/ 

public void setReleaseDate( String releaseDate )
{
this.releaseDate().setValue(releaseDate);
}

/**
	The heavy weight setter method for field releaseDate
**/ 

public void hwSetReleaseDate( String releaseDate )
{
this.releaseDate().setValue(releaseDate);
rebuildCompositeTermVector();
 }
/**
	 Sets the releaseDate directly
**/ 

public void setReleaseDateMetadata(MetadataString releaseDate)
{	this.releaseDate = releaseDate;
}
/**
	Heavy Weight Direct setter method for releaseDate
**/ 

public void hwSetReleaseDateMetadata(MetadataString releaseDate)
{	 if(this.releaseDate!=null && this.releaseDate.getValue()!=null && hasTermVector())
		 termVector().remove(this.releaseDate.termVector());
	 this.releaseDate = releaseDate;
	rebuildCompositeTermVector();
}	@xml_collection("genres") private ArrayList<Genre>	genres;

/**
	Lazy Evaluation for genres
**/ 

public  ArrayList<Genre>	genres()
{
 ArrayList<Genre>	result	=this.genres;
if(result == null)
{
result = new  ArrayList<Genre>();
this.genres	=	 result;
}
return result;
}

/**
	Set the value of field genres
**/ 

public void setGenres(  ArrayList<Genre> genres )
{
this.genres = genres ;
}

/**
	Get the value of field genres
**/ 

public  ArrayList<Genre> getGenres(){
return this.genres;
}

/**
	null
**/ 

	@xml_tag("plot") @xml_nested private MetadataString	plot;

/**
	Lazy Evaluation for plot
**/ 

public MetadataString	plot()
{
MetadataString	result	=this.plot;
if(result == null)
{
result = new MetadataString();
this.plot	=	 result;
}
return result;
}

/**
	Gets the value of the field plot
**/ 

public String getPlot(){
return plot().getValue();
}

/**
	Sets the value of the field plot
**/ 

public void setPlot( String plot )
{
this.plot().setValue(plot);
}

/**
	The heavy weight setter method for field plot
**/ 

public void hwSetPlot( String plot )
{
this.plot().setValue(plot);
rebuildCompositeTermVector();
 }
/**
	 Sets the plot directly
**/ 

public void setPlotMetadata(MetadataString plot)
{	this.plot = plot;
}
/**
	Heavy Weight Direct setter method for plot
**/ 

public void hwSetPlotMetadata(MetadataString plot)
{	 if(this.plot!=null && this.plot.getValue()!=null && hasTermVector())
		 termVector().remove(this.plot.termVector());
	 this.plot = plot;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("tagline") @xml_nested private MetadataString	tagline;

/**
	Lazy Evaluation for tagline
**/ 

public MetadataString	tagline()
{
MetadataString	result	=this.tagline;
if(result == null)
{
result = new MetadataString();
this.tagline	=	 result;
}
return result;
}

/**
	Gets the value of the field tagline
**/ 

public String getTagline(){
return tagline().getValue();
}

/**
	Sets the value of the field tagline
**/ 

public void setTagline( String tagline )
{
this.tagline().setValue(tagline);
}

/**
	The heavy weight setter method for field tagline
**/ 

public void hwSetTagline( String tagline )
{
this.tagline().setValue(tagline);
rebuildCompositeTermVector();
 }
/**
	 Sets the tagline directly
**/ 

public void setTaglineMetadata(MetadataString tagline)
{	this.tagline = tagline;
}
/**
	Heavy Weight Direct setter method for tagline
**/ 

public void hwSetTaglineMetadata(MetadataString tagline)
{	 if(this.tagline!=null && this.tagline.getValue()!=null && hasTermVector())
		 termVector().remove(this.tagline.termVector());
	 this.tagline = tagline;
	rebuildCompositeTermVector();
}	@xml_collection("cast") private ArrayList<CastMember>	cast;

/**
	Lazy Evaluation for cast
**/ 

public  ArrayList<CastMember>	cast()
{
 ArrayList<CastMember>	result	=this.cast;
if(result == null)
{
result = new  ArrayList<CastMember>();
this.cast	=	 result;
}
return result;
}

/**
	Set the value of field cast
**/ 

public void setCast(  ArrayList<CastMember> cast )
{
this.cast = cast ;
}

/**
	Get the value of field cast
**/ 

public  ArrayList<CastMember> getCast(){
return this.cast;
}
	@xml_collection("title_photos") private ArrayList<Image>	titlePhotos;

/**
	Lazy Evaluation for titlePhotos
**/ 

public  ArrayList<Image>	titlePhotos()
{
 ArrayList<Image>	result	=this.titlePhotos;
if(result == null)
{
result = new  ArrayList<Image>();
this.titlePhotos	=	 result;
}
return result;
}

/**
	Set the value of field titlePhotos
**/ 

public void setTitlePhotos(  ArrayList<Image> titlePhotos )
{
this.titlePhotos = titlePhotos ;
}

/**
	Get the value of field titlePhotos
**/ 

public  ArrayList<Image> getTitlePhotos(){
return this.titlePhotos;
}

/**
	null
**/ 

	@xml_tag("poster_img") @xml_nested private MetadataParsedURL	posterImg;

/**
	Lazy Evaluation for posterImg
**/ 

public MetadataParsedURL	posterImg()
{
MetadataParsedURL	result	=this.posterImg;
if(result == null)
{
result = new MetadataParsedURL();
this.posterImg	=	 result;
}
return result;
}

/**
	Gets the value of the field posterImg
**/ 

public ParsedURL getPosterImg(){
return posterImg().getValue();
}

/**
	Sets the value of the field posterImg
**/ 

public void setPosterImg( ParsedURL posterImg )
{
this.posterImg().setValue(posterImg);
}

/**
	The heavy weight setter method for field posterImg
**/ 

public void hwSetPosterImg( ParsedURL posterImg )
{
this.posterImg().setValue(posterImg);
rebuildCompositeTermVector();
 }
/**
	 Sets the posterImg directly
**/ 

public void setPosterImgMetadata(MetadataParsedURL posterImg)
{	this.posterImg = posterImg;
}
/**
	Heavy Weight Direct setter method for posterImg
**/ 

public void hwSetPosterImgMetadata(MetadataParsedURL posterImg)
{	 if(this.posterImg!=null && this.posterImg.getValue()!=null && hasTermVector())
		 termVector().remove(this.posterImg.termVector());
	 this.posterImg = posterImg;
	rebuildCompositeTermVector();
}
}
