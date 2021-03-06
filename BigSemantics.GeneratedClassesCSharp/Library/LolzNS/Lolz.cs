//
// Lolz.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.CreativeWorkNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.LolzNS 
{
	/// <summary>
	/// The LOLZ class
	/// </summary>
	[SimplInherit]
	public class Lolz : CreativeWork
	{
		[SimplScalar]
		private MetadataString caption;

		[SimplScalar]
		private MetadataParsedURL picture;

		[SimplScalar]
		private MetadataParsedURL mightLike;

		public Lolz()
		{ }

		public Lolz(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Caption
		{
			get{return caption;}
			set
			{
				if (this.caption != value)
				{
					this.caption = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL Picture
		{
			get{return picture;}
			set
			{
				if (this.picture != value)
				{
					this.picture = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL MightLike
		{
			get{return mightLike;}
			set
			{
				if (this.mightLike != value)
				{
					this.mightLike = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
