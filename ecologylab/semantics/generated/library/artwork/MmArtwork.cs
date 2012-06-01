//
// MmArtwork.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.artwork;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.artwork 
{
	/// <summary>
	/// ACM Multimedia Interactive Artwork class
	/// </summary>
	[SimplInherit]
	public class MmArtwork : Artwork
	{
		/// <summary>
		/// Website of the work or group responsible.
		/// </summary>
		[SimplScalar]
		private MetadataParsedURL website;

		/// <summary>
		/// Link the ACM Portal page.
		/// </summary>
		[SimplScalar]
		private MetadataParsedURL extendedAbstract;

		public MmArtwork()
		{ }

		public MmArtwork(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataParsedURL Website
		{
			get{return website;}
			set
			{
				if (this.website != value)
				{
					this.website = value;
					this.RaisePropertyChanged( () => this.Website );
				}
			}
		}

		public MetadataParsedURL ExtendedAbstract
		{
			get{return extendedAbstract;}
			set
			{
				if (this.extendedAbstract != value)
				{
					this.extendedAbstract = value;
					this.RaisePropertyChanged( () => this.ExtendedAbstract );
				}
			}
		}
	}
}