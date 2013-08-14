//
// Earthquake.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.DisasterNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.DisasterNS 
{
	/// <summary>
	/// Generalized Earthquake Object
	/// </summary>
	[SimplInherit]
	public class Earthquake : Disaster
	{
		[SimplScalar]
		private MetadataFloat depth;

		public Earthquake()
		{ }

		public Earthquake(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataFloat Depth
		{
			get{return depth;}
			set
			{
				if (this.depth != value)
				{
					this.depth = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}