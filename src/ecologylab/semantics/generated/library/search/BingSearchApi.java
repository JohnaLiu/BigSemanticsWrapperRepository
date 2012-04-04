package ecologylab.semantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.search.Search;
import ecologylab.semantics.generated.library.search.SearchCrumb;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.List;
import java.util.Map;

/** 
 *The bing Search apie.
 */ 
@simpl_inherit
public class BingSearchApi extends Search
{
	@simpl_composite
	@mm_name("search_crumb_composite")
	private SearchCrumb searchCrumbComposite;

	public BingSearchApi()
	{ super(); }

	public BingSearchApi(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public SearchCrumb getSearchCrumbComposite()
	{
		return searchCrumbComposite;
	}

	public void setSearchCrumbComposite(SearchCrumb searchCrumbComposite)
	{
		this.searchCrumbComposite = searchCrumbComposite;
	}
}
