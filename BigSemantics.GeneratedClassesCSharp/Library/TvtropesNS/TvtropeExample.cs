//
// TvtropeExample.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.TvtropesNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.TvtropesNS 
{
	[SimplInherit]
	public class TvtropeExample : CompoundDocument
	{
		[SimplComposite]
		[MmName("trope")]
		private Tvtrope trope;

		[SimplCollection("tvtrope")]
		[MmName("example_tropes")]
		private List<Tvtrope> exampleTropes;

		[SimplCollection("compound_document")]
		[MmName("comments")]
		private List<CompoundDocument> comments;

		public TvtropeExample()
		{ }

		public TvtropeExample(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Tvtrope Trope
		{
			get{return trope;}
			set
			{
				if (this.trope != value)
				{
					this.trope = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Tvtrope> ExampleTropes
		{
			get{return exampleTropes;}
			set
			{
				if (this.exampleTropes != value)
				{
					this.exampleTropes = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<CompoundDocument> Comments
		{
			get{return comments;}
			set
			{
				if (this.comments != value)
				{
					this.comments = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
