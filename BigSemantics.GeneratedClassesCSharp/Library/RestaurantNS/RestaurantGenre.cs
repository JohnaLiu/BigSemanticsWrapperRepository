//
// RestaurantGenre.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.RestaurantNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.RestaurantNS 
{
	/// <summary>
	/// Restaurants genre.
	/// </summary>
	[SimplInherit]
	public class RestaurantGenre : Document
	{
		[SimplCollection("restaurant")]
		[MmName("restaurants")]
		private List<Restaurant> restaurants;

		public RestaurantGenre()
		{ }

		public RestaurantGenre(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Restaurant> Restaurants
		{
			get{return restaurants;}
			set
			{
				if (this.restaurants != value)
				{
					this.restaurants = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
