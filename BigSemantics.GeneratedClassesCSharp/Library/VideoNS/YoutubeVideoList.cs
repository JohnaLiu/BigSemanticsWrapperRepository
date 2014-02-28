//
// YoutubeVideoList.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.VideoNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.VideoNS 
{
	[SimplInherit]
	public class YoutubeVideoList : CompoundDocument
	{
		[SimplCollection("youtube_video")]
		[MmName("videos")]
		private List<YoutubeVideo> videos;

		public YoutubeVideoList()
		{ }

		public YoutubeVideoList(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<YoutubeVideo> Videos
		{
			get{return videos;}
			set
			{
				if (this.videos != value)
				{
					this.videos = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
