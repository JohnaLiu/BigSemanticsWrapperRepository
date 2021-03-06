//
// Dc.cs
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

namespace Ecologylab.Semantics.Generated.Library.RssNS 
{
	/// <summary>
	/// Dublin core fields.
	/// </summary>
	[SimplInherit]
	public class Dc : CompoundDocument
	{
		[SimplScalar]
		[SimplHints(new Hint[] {Hint.XmlLeaf})]
		[SimplTag("dc:creator")]
		private MetadataString dcCreator;

		[SimplScalar]
		[SimplHints(new Hint[] {Hint.XmlLeaf})]
		[SimplTag("dc:subject")]
		private MetadataString dcSubject;

		[SimplScalar]
		[SimplHints(new Hint[] {Hint.XmlLeaf})]
		[SimplTag("dc:description")]
		[SimplOtherTags(new String[] {"description"})]
		private MetadataString dcDescription;

		[SimplScalar]
		[SimplHints(new Hint[] {Hint.XmlLeaf})]
		[SimplTag("dc:title")]
		[SimplOtherTags(new String[] {"title"})]
		private MetadataString dcTitle;

		[SimplScalar]
		[SimplHints(new Hint[] {Hint.XmlLeaf})]
		[SimplTag("dc:date")]
		[SimplOtherTags(new String[] {"pubDate"})]
		private MetadataDate dcDate;

		public Dc()
		{ }

		public Dc(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString DcCreator
		{
			get{return dcCreator;}
			set
			{
				if (this.dcCreator != value)
				{
					this.dcCreator = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString DcSubject
		{
			get{return dcSubject;}
			set
			{
				if (this.dcSubject != value)
				{
					this.dcSubject = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString DcDescription
		{
			get{return dcDescription;}
			set
			{
				if (this.dcDescription != value)
				{
					this.dcDescription = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString DcTitle
		{
			get{return dcTitle;}
			set
			{
				if (this.dcTitle != value)
				{
					this.dcTitle = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataDate DcDate
		{
			get{return dcDate;}
			set
			{
				if (this.dcDate != value)
				{
					this.dcDate = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
