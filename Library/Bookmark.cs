//
// Bookmark.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library 
{
	[SimplInherit]
	public class Bookmark : Metadata
	{
		[SimplScalar]
		[SimplCompositeAsScalar]
		private MetadataString title;

		[SimplScalar]
		private MetadataParsedURL link;

		[SimplScalar]
		private MetadataParsedURL pic;

		public Bookmark()
		{ }

		public Bookmark(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Title
		{
			get{return title;}
			set
			{
				if (this.title != value)
				{
					this.title = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL Link
		{
			get{return link;}
			set
			{
				if (this.link != value)
				{
					this.link = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL Pic
		{
			get{return pic;}
			set
			{
				if (this.pic != value)
				{
					this.pic = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}