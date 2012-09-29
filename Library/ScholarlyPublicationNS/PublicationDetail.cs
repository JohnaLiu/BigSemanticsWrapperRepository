//
// PublicationDetail.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.ScholarlyPublicationNS 
{
	[SimplInherit]
	public class PublicationDetail : Metadata
	{
		[SimplScalar]
		private MetadataString publicationCount;

		[SimplScalar]
		private MetadataString citationCount;

		[SimplScalar]
		private MetadataString years;

		public PublicationDetail()
		{ }

		public PublicationDetail(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString PublicationCount
		{
			get{return publicationCount;}
			set
			{
				if (this.publicationCount != value)
				{
					this.publicationCount = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString CitationCount
		{
			get{return citationCount;}
			set
			{
				if (this.citationCount != value)
				{
					this.citationCount = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Years
		{
			get{return years;}
			set
			{
				if (this.years != value)
				{
					this.years = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}