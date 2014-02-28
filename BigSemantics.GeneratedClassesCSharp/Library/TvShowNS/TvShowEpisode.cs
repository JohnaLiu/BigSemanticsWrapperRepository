//
// TvShowEpisode.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.TvShowNS 
{
	/// <summary>
	/// TV Show episode
	/// </summary>
	[SimplInherit]
	public class TvShowEpisode : Document
	{
		[SimplScalar]
		[SimplHints(new Hint[] {Hint.XmlLeafCdata})]
		private MetadataString episodeNumber;

		public TvShowEpisode()
		{ }

		public TvShowEpisode(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString EpisodeNumber
		{
			get{return episodeNumber;}
			set
			{
				if (this.episodeNumber != value)
				{
					this.episodeNumber = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
