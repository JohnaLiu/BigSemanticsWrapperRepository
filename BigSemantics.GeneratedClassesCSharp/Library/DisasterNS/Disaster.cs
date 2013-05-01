//
// Disaster.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.DisasterNS;
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

namespace Ecologylab.Semantics.Generated.Library.DisasterNS 
{
	/// <summary>
	/// Generalized Disaster Object
	/// </summary>
	[SimplInherit]
	public class Disaster : Event
	{
		[SimplScalar]
		private MetadataFloat magnitude;

		[SimplComposite]
		[MmName("map_image")]
		private Image mapImage;

		[SimplComposite]
		[MmName("map")]
		private Document map;

		[SimplComposite]
		[MmName("source")]
		private CompoundDocument source;

		public Disaster()
		{ }

		public Disaster(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataFloat Magnitude
		{
			get{return magnitude;}
			set
			{
				if (this.magnitude != value)
				{
					this.magnitude = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Image MapImage
		{
			get{return mapImage;}
			set
			{
				if (this.mapImage != value)
				{
					this.mapImage = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Document Map
		{
			get{return map;}
			set
			{
				if (this.map != value)
				{
					this.map = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public CompoundDocument Source
		{
			get{return source;}
			set
			{
				if (this.source != value)
				{
					this.source = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
