//
// YoutubeSearchResults.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.SearchNS;
using Ecologylab.Semantics.Generated.Library.VideoNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.VideoNS 
{
	/// <summary>
	/// youtube video search results page
	/// </summary>
	[SimplInherit]
	public class YoutubeSearchResults : Search<YoutubeVideo>
	{
		public YoutubeSearchResults()
		{ }

		public YoutubeSearchResults(MetaMetadataCompositeField mmd) : base(mmd) { }

	}
}
