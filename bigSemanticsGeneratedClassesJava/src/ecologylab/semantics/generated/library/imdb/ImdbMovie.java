package ecologylab.semantics.generated.library.imdb;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.movie.Movie;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.List;
import java.util.Map;

/** 
 *A movie in IMDB.
 */ 
@simpl_inherit
public class ImdbMovie extends Movie
{
	public ImdbMovie()
	{ super(); }

	public ImdbMovie(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

}