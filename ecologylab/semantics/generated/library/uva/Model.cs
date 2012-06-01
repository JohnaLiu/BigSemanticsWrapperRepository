//
// Model.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.uva;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.uva 
{
	[SimplInherit]
	public class Model : Metadata
	{
		[SimplCollection("topic_cluster")]
		[MmName("topic_clusters")]
		private List<TopicCluster> topicClusters;

		public Model()
		{ }

		public Model(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<TopicCluster> TopicClusters
		{
			get{return topicClusters;}
			set
			{
				if (this.topicClusters != value)
				{
					this.topicClusters = value;
					this.RaisePropertyChanged( () => this.TopicClusters );
				}
			}
		}
	}
}