//
// GlobeCartoon.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.CartoonNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.CartoonNS 
{
	[SimplInherit]
	public class GlobeCartoon : Cartoon
	{
		[SimplScalar]
		private MetadataDate datePublished;

		public GlobeCartoon()
		{ }

		public GlobeCartoon(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataDate DatePublished
		{
			get{return datePublished;}
			set
			{
				if (this.datePublished != value)
				{
					this.datePublished = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
