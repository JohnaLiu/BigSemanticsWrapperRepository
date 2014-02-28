//
// YelpBusiness.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.ProductAndServiceNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.YelpNS 
{
	/// <summary>
	/// Yelp local business description page
	/// </summary>
	[SimplInherit]
	public class YelpBusiness : Service
	{
		/// <summary>
		/// the type of business
		/// </summary>
		[SimplScalar]
		private MetadataString category;

		/// <summary>
		/// the hours that the attraction is open
		/// </summary>
		[SimplScalar]
		private MetadataString openHours;

		[SimplScalar]
		private MetadataString priceRange;

		public YelpBusiness()
		{ }

		public YelpBusiness(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Category
		{
			get{return category;}
			set
			{
				if (this.category != value)
				{
					this.category = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString OpenHours
		{
			get{return openHours;}
			set
			{
				if (this.openHours != value)
				{
					this.openHours = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString PriceRange
		{
			get{return priceRange;}
			set
			{
				if (this.priceRange != value)
				{
					this.priceRange = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
