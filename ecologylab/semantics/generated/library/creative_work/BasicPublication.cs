//
// BasicPublication.cs
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
using ecologylab.semantics.generated.library.creative_work;
using ecologylab.semantics.generated.library.publication;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.creative_work 
{
	/// <summary>
	/// A publication.
	/// </summary>
	[SimplInherit]
	public class BasicPublication : CreativeWork
	{
		[SimplScalar]
		private MetadataString isbn;

		[SimplComposite]
		[MmName("publisher")]
		private Publisher publisher;

		public BasicPublication()
		{ }

		public BasicPublication(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Isbn
		{
			get{return isbn;}
			set
			{
				if (this.isbn != value)
				{
					this.isbn = value;
					this.RaisePropertyChanged( () => this.Isbn );
				}
			}
		}

		public Publisher Publisher
		{
			get{return publisher;}
			set
			{
				if (this.publisher != value)
				{
					this.publisher = value;
					this.RaisePropertyChanged( () => this.Publisher );
				}
			}
		}
	}
}