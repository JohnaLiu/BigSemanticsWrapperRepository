//
// Patent.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.CreativeWorkNS;
using Ecologylab.Semantics.Generated.Library.PatentNS;
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

namespace Ecologylab.Semantics.Generated.Library.PatentNS 
{
	/// <summary>
	/// Patents Class
	/// </summary>
	[SimplInherit]
	public class Patent : CreativeWork
	{
		[SimplScalar]
		private MetadataString inventor;

		[SimplScalar]
		private MetadataDate filingDate;

		[SimplCollection("patent_classification")]
		[MmName("classifications")]
		private List<PatentClassification> classifications;

		[SimplCollection("claim")]
		[MmName("claims")]
		private List<Ecologylab.Semantics.MetadataNS.Scalar.MetadataString> claims;

		/// <summary>
		/// subsequent patents that cite this
		/// </summary>
		[SimplCollection("patent")]
		[SimplOtherTags(new String[] {"referenced_bys"})]
		[MmName("citations")]
		private List<Patent> citations;

		/// <summary>
		/// prior patents that this references
		/// </summary>
		[SimplCollection("patent")]
		[MmName("references")]
		private List<Patent> references;

		[SimplCollection("image")]
		[MmName("drawings")]
		private List<Image> drawings;

		public Patent()
		{ }

		public Patent(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Inventor
		{
			get{return inventor;}
			set
			{
				if (this.inventor != value)
				{
					this.inventor = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataDate FilingDate
		{
			get{return filingDate;}
			set
			{
				if (this.filingDate != value)
				{
					this.filingDate = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<PatentClassification> Classifications
		{
			get{return classifications;}
			set
			{
				if (this.classifications != value)
				{
					this.classifications = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Ecologylab.Semantics.MetadataNS.Scalar.MetadataString> Claims
		{
			get{return claims;}
			set
			{
				if (this.claims != value)
				{
					this.claims = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Patent> Citations
		{
			get{return citations;}
			set
			{
				if (this.citations != value)
				{
					this.citations = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Patent> References
		{
			get{return references;}
			set
			{
				if (this.references != value)
				{
					this.references = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Image> Drawings
		{
			get{return drawings;}
			set
			{
				if (this.drawings != value)
				{
					this.drawings = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}