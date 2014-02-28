//
// TvtropeFolder.cs
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
	public class TvtropeFolder : CompoundDocument
	{
		[SimplCollection("tvtrope_example")]
		[MmName("examples")]
		private List<TvtropeExample> examples;

		[SimplCollection("tvtrope_example")]
		[MmName("ordered_examples")]
		private List<TvtropeExample> orderedExamples;

		public TvtropeFolder()
		{ }

		public TvtropeFolder(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<TvtropeExample> Examples
		{
			get{return examples;}
			set
			{
				if (this.examples != value)
				{
					this.examples = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<TvtropeExample> OrderedExamples
		{
			get{return orderedExamples;}
			set
			{
				if (this.orderedExamples != value)
				{
					this.orderedExamples = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
