//
// LeagueAbility.cs
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

namespace Ecologylab.Semantics.Generated.Library.LeagueoflegendsNS 
{
	[SimplInherit]
	public class LeagueAbility : CompoundDocument
	{
		[SimplScalar]
		private MetadataString tooltip;

		[SimplScalar]
		private MetadataString cost;

		[SimplScalar]
		private MetadataString range;

		public LeagueAbility()
		{ }

		public LeagueAbility(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Tooltip
		{
			get{return tooltip;}
			set
			{
				if (this.tooltip != value)
				{
					this.tooltip = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Cost
		{
			get{return cost;}
			set
			{
				if (this.cost != value)
				{
					this.cost = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Range
		{
			get{return range;}
			set
			{
				if (this.range != value)
				{
					this.range = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
