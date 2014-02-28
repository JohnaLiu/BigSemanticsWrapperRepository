//
// HomeDepotProduct.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.DreamHouseNS;
using Ecologylab.Semantics.Generated.Library.ProductAndServiceNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.DreamHouseNS 
{
	[SimplInherit]
	public class HomeDepotProduct : Product
	{
		[SimplCollection("home_depot_product")]
		[MmName("people_also_buy")]
		private List<HomeDepotProduct> peopleAlsoBuy;

		public HomeDepotProduct()
		{ }

		public HomeDepotProduct(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<HomeDepotProduct> PeopleAlsoBuy
		{
			get{return peopleAlsoBuy;}
			set
			{
				if (this.peopleAlsoBuy != value)
				{
					this.peopleAlsoBuy = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
