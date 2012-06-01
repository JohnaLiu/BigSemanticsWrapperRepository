//
// FlickrImageDetailTwo.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.flickr;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.flickr 
{
	/// <summary>
	/// A Flickr Image result page
	/// </summary>
	[SimplInherit]
	public class FlickrImageDetailTwo : CompoundDocument
	{
		[SimplScalar]
		private MetadataParsedURL imageLocation;

		[SimplScalar]
		private MetadataString views;

		[SimplScalar]
		private MetadataString place;

		[SimplScalar]
		private MetadataParsedURL placeLink;

		[SimplCollection("flickr_tag")]
		[MmName("flickr_tags")]
		private List<FlickrTag> flickrTags;

		[SimplComposite]
		[MmName("author_photos")]
		private AuthorPhotos authorPhotos;

		public FlickrImageDetailTwo()
		{ }

		public FlickrImageDetailTwo(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataParsedURL ImageLocation
		{
			get{return imageLocation;}
			set
			{
				if (this.imageLocation != value)
				{
					this.imageLocation = value;
					this.RaisePropertyChanged( () => this.ImageLocation );
				}
			}
		}

		public MetadataString Views
		{
			get{return views;}
			set
			{
				if (this.views != value)
				{
					this.views = value;
					this.RaisePropertyChanged( () => this.Views );
				}
			}
		}

		public MetadataString Place
		{
			get{return place;}
			set
			{
				if (this.place != value)
				{
					this.place = value;
					this.RaisePropertyChanged( () => this.Place );
				}
			}
		}

		public MetadataParsedURL PlaceLink
		{
			get{return placeLink;}
			set
			{
				if (this.placeLink != value)
				{
					this.placeLink = value;
					this.RaisePropertyChanged( () => this.PlaceLink );
				}
			}
		}

		public List<FlickrTag> FlickrTags
		{
			get{return flickrTags;}
			set
			{
				if (this.flickrTags != value)
				{
					this.flickrTags = value;
					this.RaisePropertyChanged( () => this.FlickrTags );
				}
			}
		}

		public AuthorPhotos AuthorPhotos
		{
			get{return authorPhotos;}
			set
			{
				if (this.authorPhotos != value)
				{
					this.authorPhotos = value;
					this.RaisePropertyChanged( () => this.AuthorPhotos );
				}
			}
		}
	}
}