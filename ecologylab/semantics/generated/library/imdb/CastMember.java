package ecologylab.semantics.generated.library.imdb;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
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
import ecologylab.semantics.metadata.builtins.Clipping;
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
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class CastMember
extends Metadata
{

@simpl_composite @mm_name("actor")
private Entity<PersonDetails>	actor;

@simpl_composite @mm_name("character")
private Entity<PersonDetails>	character;



/**
	Constructor
*/
public CastMember()
{
 super();
}

/**
	Constructor
*/
public CastMember(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for actor
*/
public Entity<PersonDetails>	actor()
{
	Entity<PersonDetails>	result = this.actor;
	if (result == null)
	{
		result = new Entity<PersonDetails>();
		this.actor = result;
	}
	return result;
}

/**
	Get the value of field actor
*/
public Entity<PersonDetails> getActor()
{
	return this.actor;
}

/**
	Set the value of field actor
*/
public void setActor(Entity<PersonDetails> actor)
{
	this.actor = actor;
}

/**
	Lazy evaluation for character
*/
public Entity<PersonDetails>	character()
{
	Entity<PersonDetails>	result = this.character;
	if (result == null)
	{
		result = new Entity<PersonDetails>();
		this.character = result;
	}
	return result;
}

/**
	Get the value of field character
*/
public Entity<PersonDetails> getCharacter()
{
	return this.character;
}

/**
	Set the value of field character
*/
public void setCharacter(Entity<PersonDetails> character)
{
	this.character = character;
}


}

