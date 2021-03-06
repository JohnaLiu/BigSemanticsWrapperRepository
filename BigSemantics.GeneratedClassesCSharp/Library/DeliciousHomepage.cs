//
// DeliciousHomepage.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library 
{
	/// <summary>
	/// Delicious home page class
	/// </summary>
	[SimplInherit]
	public class DeliciousHomepage : CompoundDocument
	{
		[SimplCollection("bookmark")]
		[MmName("bookmarks")]
		private List<Bookmark> bookmarks;

		public DeliciousHomepage()
		{ }

		public DeliciousHomepage(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Bookmark> Bookmarks
		{
			get{return bookmarks;}
			set
			{
				if (this.bookmarks != value)
				{
					this.bookmarks = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
