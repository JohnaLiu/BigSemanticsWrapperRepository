//
// IeeeXploreArticle.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.IeeeXploreNS;
using Ecologylab.Semantics.Generated.Library.ScholarlyArticleNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.IeeeXploreNS 
{
	[SimplInherit]
	public class IeeeXploreArticle : ScholarlyArticle
	{
		[SimplCollection("ieee_xplore_search")]
		[MmName("articles_by_authors")]
		private List<IeeeXploreSearch> articlesByAuthors;

		[SimplComposite]
		[MmName("references_page")]
		private IeeeXploreReferences referencesPage;

		[SimplComposite]
		[MmName("citations_page")]
		private IeeeXploreCitations citationsPage;

		/// <summary>
		/// The digital object identifier of the article
		/// </summary>
		[SimplScalar]
		private MetadataParsedURL doi;

		public IeeeXploreArticle()
		{ }

		public IeeeXploreArticle(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<IeeeXploreSearch> ArticlesByAuthors
		{
			get{return articlesByAuthors;}
			set
			{
				if (this.articlesByAuthors != value)
				{
					this.articlesByAuthors = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public IeeeXploreReferences ReferencesPage
		{
			get{return referencesPage;}
			set
			{
				if (this.referencesPage != value)
				{
					this.referencesPage = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public IeeeXploreCitations CitationsPage
		{
			get{return citationsPage;}
			set
			{
				if (this.citationsPage != value)
				{
					this.citationsPage = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL Doi
		{
			get{return doi;}
			set
			{
				if (this.doi != value)
				{
					this.doi = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
