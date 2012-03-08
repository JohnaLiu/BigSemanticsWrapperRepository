package ecologylab.semantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.SimplTypesScope;
import java.util.List;
import java.util.Map;

public class RepositoryMetadataTranslationScope
{

	protected static final Class TRANSLATIONS[] =
	{
		ecologylab.semantics.generated.library.Bookmark.class,

		ecologylab.semantics.generated.library.DeliciousHomepage.class,

		ecologylab.semantics.generated.library.GoogleImageSearchPage.class,

		ecologylab.semantics.generated.library.GoogleImageSearchType.class,

		ecologylab.semantics.generated.library.ImageResult.class,

		ecologylab.semantics.generated.library.Lolz.class,

		ecologylab.semantics.generated.library.PdfMixin.class,

		ecologylab.semantics.generated.library.Restaurant.class,

		ecologylab.semantics.generated.library.Tag.class,

		ecologylab.semantics.generated.library.Tumblr.class,

		ecologylab.semantics.generated.library.WeatherReport.class,

		ecologylab.semantics.generated.library.artwork.Artist.class,

		ecologylab.semantics.generated.library.artwork.Artwork.class,

		ecologylab.semantics.generated.library.artwork.MmArtwork.class,

		ecologylab.semantics.generated.library.artwork.MomaArtwork.class,

		ecologylab.semantics.generated.library.artwork.TempFieldValueHolder.class,

		ecologylab.semantics.generated.library.bibManaging.CitationInfo.class,

		ecologylab.semantics.generated.library.bibManaging.CiteseerxRecord.class,

		ecologylab.semantics.generated.library.bibManaging.CiteseerxSearch.class,

		ecologylab.semantics.generated.library.bibManaging.CiteseerxSearchResult.class,

		ecologylab.semantics.generated.library.bibManaging.CiteseerxSummary.class,

		ecologylab.semantics.generated.library.british_cartoon_archive.BritishCartoonArchive.class,

		ecologylab.semantics.generated.library.buzz.GoogleTrends.class,

		ecologylab.semantics.generated.library.buzz.HotSearch.class,

		ecologylab.semantics.generated.library.camera.CameraSettings.class,

		ecologylab.semantics.generated.library.creativeWork.Author.class,

		ecologylab.semantics.generated.library.creativeWork.BasicPublication.class,

		ecologylab.semantics.generated.library.creativeWork.CreativeWork.class,

		ecologylab.semantics.generated.library.creativeWork.Periodical.class,

		ecologylab.semantics.generated.library.dlese.AdditionalMetadata.class,

		ecologylab.semantics.generated.library.dlese.Audience.class,

		ecologylab.semantics.generated.library.dlese.Collection.class,

		ecologylab.semantics.generated.library.dlese.Contributor.class,

		ecologylab.semantics.generated.library.dlese.DateInfo.class,

		ecologylab.semantics.generated.library.dlese.DleseGetRecord.class,

		ecologylab.semantics.generated.library.dlese.DleseRecord.class,

		ecologylab.semantics.generated.library.dlese.DleseRecord1.class,

		ecologylab.semantics.generated.library.dlese.DleseRecord2.class,

		ecologylab.semantics.generated.library.dlese.DleseRecordHead.class,

		ecologylab.semantics.generated.library.dlese.DleseUserSearch.class,

		ecologylab.semantics.generated.library.dlese.Educational.class,

		ecologylab.semantics.generated.library.dlese.General.class,

		ecologylab.semantics.generated.library.dlese.GetRecordAdditionalMetadata.class,

		ecologylab.semantics.generated.library.dlese.Head1.class,

		ecologylab.semantics.generated.library.dlese.Head2.class,

		ecologylab.semantics.generated.library.dlese.ItemRecord.class,

		ecologylab.semantics.generated.library.dlese.Lifecycle.class,

		ecologylab.semantics.generated.library.dlese.Organization.class,

		ecologylab.semantics.generated.library.dlese.RecordMetaMetadata.class,

		ecologylab.semantics.generated.library.dlese.RecordMetadata.class,

		ecologylab.semantics.generated.library.dlese.ResultInfo.class,

		ecologylab.semantics.generated.library.dlese.SearchAdditionalMetadataAdn.class,

		ecologylab.semantics.generated.library.dlese.SearchSection.class,

		ecologylab.semantics.generated.library.dlese.UserSearchAdditionalMetadata.class,

		ecologylab.semantics.generated.library.fastflip.FastflipSearch.class,

		ecologylab.semantics.generated.library.fastflip.Thumbnail.class,

		ecologylab.semantics.generated.library.flickr.AuthorPhotos.class,

		ecologylab.semantics.generated.library.flickr.FlickrAuthor.class,

		ecologylab.semantics.generated.library.flickr.FlickrGroups.class,

		ecologylab.semantics.generated.library.flickr.FlickrImageDetail.class,

		ecologylab.semantics.generated.library.flickr.FlickrImageDetailTwo.class,

		ecologylab.semantics.generated.library.flickr.FlickrLink.class,

		ecologylab.semantics.generated.library.flickr.FlickrNearby.class,

		ecologylab.semantics.generated.library.flickr.FlickrSearch.class,

		ecologylab.semantics.generated.library.flickr.FlickrSearchTwo.class,

		ecologylab.semantics.generated.library.flickr.FlickrTag.class,

		ecologylab.semantics.generated.library.flickr.FlickrTags.class,

		ecologylab.semantics.generated.library.flickr.FlickrTagsInteresting.class,

		ecologylab.semantics.generated.library.gaurdian_comic.GaurdianComic.class,

		ecologylab.semantics.generated.library.globe_cartoon.GlobeCartoon.class,

		ecologylab.semantics.generated.library.googleBooks.GoogleBook.class,

		ecologylab.semantics.generated.library.googleBooks.Page.class,

		ecologylab.semantics.generated.library.gps.ContactPoint.class,

		ecologylab.semantics.generated.library.gps.GisLocation.class,

		ecologylab.semantics.generated.library.gps.PostalAddress.class,

		ecologylab.semantics.generated.library.hotel.Hotel.class,

		ecologylab.semantics.generated.library.icdl.IcdlBook.class,

		ecologylab.semantics.generated.library.icdl.IcdlBookPreview.class,

		ecologylab.semantics.generated.library.icdl.IcdlImageResult.class,

		ecologylab.semantics.generated.library.imdb.BirthDetail.class,

		ecologylab.semantics.generated.library.imdb.CastMember.class,

		ecologylab.semantics.generated.library.imdb.Genre.class,

		ecologylab.semantics.generated.library.imdb.ImdbChart.class,

		ecologylab.semantics.generated.library.imdb.ImdbGenre.class,

		ecologylab.semantics.generated.library.imdb.ImdbTitle.class,

		ecologylab.semantics.generated.library.imdb.PersonDetails.class,

		ecologylab.semantics.generated.library.misc.DcDocument.class,

		ecologylab.semantics.generated.library.misc.Dlms.class,

		ecologylab.semantics.generated.library.misc.IcdlImage.class,

		ecologylab.semantics.generated.library.misc.Nsdl.class,

		ecologylab.semantics.generated.library.nsdl.Header.class,

		ecologylab.semantics.generated.library.nsdl.NsdlDocument.class,

		ecologylab.semantics.generated.library.nsdl.NsdlService.class,

		ecologylab.semantics.generated.library.nsdl.SearchResults.class,

		ecologylab.semantics.generated.library.nsf.Investigator.class,

		ecologylab.semantics.generated.library.nsf.NsfAward.class,

		ecologylab.semantics.generated.library.nsf.NsfAwardSearch.class,

		ecologylab.semantics.generated.library.opml.Body.class,

		ecologylab.semantics.generated.library.opml.Head.class,

		ecologylab.semantics.generated.library.opml.Opml.class,

		ecologylab.semantics.generated.library.opml.Outline.class,

		ecologylab.semantics.generated.library.patents.GoogleSorry.class,

		ecologylab.semantics.generated.library.patents.Patent.class,

		ecologylab.semantics.generated.library.patents.PatentClassification.class,

		ecologylab.semantics.generated.library.political_cartoon.PoliticalCartoon.class,

		ecologylab.semantics.generated.library.products.AmazonProduct.class,

		ecologylab.semantics.generated.library.products.BestsellerList.class,

		ecologylab.semantics.generated.library.products.Product.class,

		ecologylab.semantics.generated.library.products.ProductReview.class,

		ecologylab.semantics.generated.library.publication.AmazonBook.class,

		ecologylab.semantics.generated.library.publication.Book.class,

		ecologylab.semantics.generated.library.publication.Publication.class,

		ecologylab.semantics.generated.library.publication.Publisher.class,

		ecologylab.semantics.generated.library.publication.Subject.class,

		ecologylab.semantics.generated.library.publication.TermType.class,

		ecologylab.semantics.generated.library.rss.Channel.class,

		ecologylab.semantics.generated.library.rss.Dc.class,

		ecologylab.semantics.generated.library.rss.Item.class,

		ecologylab.semantics.generated.library.rss.MediaContent.class,

		ecologylab.semantics.generated.library.rss.Rss.class,

		ecologylab.semantics.generated.library.rss.Rss22.class,

		ecologylab.semantics.generated.library.rss.YahooMediaRss.class,

		ecologylab.semantics.generated.library.scholarlyPublication.AcmPortalSearch.class,

		ecologylab.semantics.generated.library.scholarlyPublication.AcmPortalSearchResult.class,

		ecologylab.semantics.generated.library.scholarlyPublication.ScholarlyArticle.class,

		ecologylab.semantics.generated.library.scienceDirect.ScienceDirectArticle.class,

		ecologylab.semantics.generated.library.search.BingImageSearchResult.class,

		ecologylab.semantics.generated.library.search.BingSearch.class,

		ecologylab.semantics.generated.library.search.BingSearchImageSection.class,

		ecologylab.semantics.generated.library.search.BingSearchWebSection.class,

		ecologylab.semantics.generated.library.search.BingWebSearchResult.class,

		ecologylab.semantics.generated.library.search.DeliciousSearch.class,

		ecologylab.semantics.generated.library.search.FlickrNearbySearchResult.class,

		ecologylab.semantics.generated.library.search.GoogleScholarSearch.class,

		ecologylab.semantics.generated.library.search.GoogleScholarSearchResult.class,

		ecologylab.semantics.generated.library.search.ImageInSearchResult.class,

		ecologylab.semantics.generated.library.search.Search.class,

		ecologylab.semantics.generated.library.search.SearchMeta.class,

		ecologylab.semantics.generated.library.search.SearchResult.class,

		ecologylab.semantics.generated.library.search.SlashdotSearch.class,

		ecologylab.semantics.generated.library.search.SocialMediaSearchResult.class,

		ecologylab.semantics.generated.library.search.TumblrSearch.class,

		ecologylab.semantics.generated.library.search.YahooGeoCode.class,

		ecologylab.semantics.generated.library.search.YahooGeoCodeResult.class,

		ecologylab.semantics.generated.library.search.YahooResult.class,

		ecologylab.semantics.generated.library.search.YahooResultSet.class,

		ecologylab.semantics.generated.library.search.YahooThumbnail.class,

		ecologylab.semantics.generated.library.sfu_cartoon_archive.SfuCartoonArchive.class,

		ecologylab.semantics.generated.library.slashdot.Anchor.class,

		ecologylab.semantics.generated.library.slashdot.SlashdotArticle.class,

		ecologylab.semantics.generated.library.slashdot.SlashdotItem.class,

		ecologylab.semantics.generated.library.slashdot.SlashdotRss.class,

		ecologylab.semantics.generated.library.slashdot.SlashdotTag.class,

		ecologylab.semantics.generated.library.truman_library_1948_campaign_cartoons.TrumanLibrary1948CampaignCartoons.class,

		ecologylab.semantics.generated.library.urbanspoon.UrbanSpoonGenre.class,

		ecologylab.semantics.generated.library.uva.DocumentSet.class,

		ecologylab.semantics.generated.library.uva.KeywordSet.class,

		ecologylab.semantics.generated.library.uva.Model.class,

		ecologylab.semantics.generated.library.uva.Topic.class,

		ecologylab.semantics.generated.library.uva.TopicCluster.class,

		ecologylab.semantics.generated.library.wikipedia.Category.class,

		ecologylab.semantics.generated.library.wikipedia.Paragraph.class,

		ecologylab.semantics.generated.library.wikipedia.Section.class,

		ecologylab.semantics.generated.library.wikipedia.Thumbinner.class,

		ecologylab.semantics.generated.library.wikipedia.WikiAnchor.class,

		ecologylab.semantics.generated.library.wikipedia.WikipediaMobilePage.class,

		ecologylab.semantics.generated.library.wikipedia.WikipediaPage.class,

		ecologylab.semantics.generated.library.wikipedia.WikipediaPageType.class,

	};

	public static SimplTypesScope get()
	{
		return SimplTypesScope.get(SemanticsNames.REPOSITORY_METADATA_TRANSLATIONS, MetadataBuiltinsTranslationScope.get(), TRANSLATIONS);
	}

}