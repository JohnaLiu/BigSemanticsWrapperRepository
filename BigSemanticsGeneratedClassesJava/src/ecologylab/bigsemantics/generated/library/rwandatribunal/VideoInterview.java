package ecologylab.bigsemantics.generated.library.rwandatribunal;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.Document;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

/** 
 *video interview
 */ 
@simpl_inherit
public class VideoInterview extends Document
{
	@simpl_scalar
	private MetadataString interviewee;

	@simpl_scalar
	private MetadataString role;

	@simpl_scalar
	private MetadataString countryOfOrigin;

	@simpl_scalar
	private MetadataString interviewDate;

	@simpl_scalar
	private MetadataString interviewers;

	@simpl_scalar
	private MetadataString partOrTimestamp;

	@simpl_scalar
	private MetadataParsedURL videoDownloadLink;

	@simpl_scalar
	private MetadataParsedURL audioDownloadLink;

	public VideoInterview()
	{ super(); }

	public VideoInterview(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	interviewee()
	{
		MetadataString	result = this.interviewee;
		if (result == null)
		{
			result = new MetadataString();
			this.interviewee = result;
		}
		return result;
	}

	public String getInterviewee()
	{
		return this.interviewee == null ? null : interviewee().getValue();
	}

	public MetadataString getIntervieweeMetadata()
	{
		return interviewee;
	}

	public void setInterviewee(String interviewee)
	{
		if (interviewee != null)
			this.interviewee().setValue(interviewee);
	}

	public void setIntervieweeMetadata(MetadataString interviewee)
	{
		this.interviewee = interviewee;
	}

	public MetadataString	role()
	{
		MetadataString	result = this.role;
		if (result == null)
		{
			result = new MetadataString();
			this.role = result;
		}
		return result;
	}

	public String getRole()
	{
		return this.role == null ? null : role().getValue();
	}

	public MetadataString getRoleMetadata()
	{
		return role;
	}

	public void setRole(String role)
	{
		if (role != null)
			this.role().setValue(role);
	}

	public void setRoleMetadata(MetadataString role)
	{
		this.role = role;
	}

	public MetadataString	countryOfOrigin()
	{
		MetadataString	result = this.countryOfOrigin;
		if (result == null)
		{
			result = new MetadataString();
			this.countryOfOrigin = result;
		}
		return result;
	}

	public String getCountryOfOrigin()
	{
		return this.countryOfOrigin == null ? null : countryOfOrigin().getValue();
	}

	public MetadataString getCountryOfOriginMetadata()
	{
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin)
	{
		if (countryOfOrigin != null)
			this.countryOfOrigin().setValue(countryOfOrigin);
	}

	public void setCountryOfOriginMetadata(MetadataString countryOfOrigin)
	{
		this.countryOfOrigin = countryOfOrigin;
	}

	public MetadataString	interviewDate()
	{
		MetadataString	result = this.interviewDate;
		if (result == null)
		{
			result = new MetadataString();
			this.interviewDate = result;
		}
		return result;
	}

	public String getInterviewDate()
	{
		return this.interviewDate == null ? null : interviewDate().getValue();
	}

	public MetadataString getInterviewDateMetadata()
	{
		return interviewDate;
	}

	public void setInterviewDate(String interviewDate)
	{
		if (interviewDate != null)
			this.interviewDate().setValue(interviewDate);
	}

	public void setInterviewDateMetadata(MetadataString interviewDate)
	{
		this.interviewDate = interviewDate;
	}

	public MetadataString	interviewers()
	{
		MetadataString	result = this.interviewers;
		if (result == null)
		{
			result = new MetadataString();
			this.interviewers = result;
		}
		return result;
	}

	public String getInterviewers()
	{
		return this.interviewers == null ? null : interviewers().getValue();
	}

	public MetadataString getInterviewersMetadata()
	{
		return interviewers;
	}

	public void setInterviewers(String interviewers)
	{
		if (interviewers != null)
			this.interviewers().setValue(interviewers);
	}

	public void setInterviewersMetadata(MetadataString interviewers)
	{
		this.interviewers = interviewers;
	}

	public MetadataString	partOrTimestamp()
	{
		MetadataString	result = this.partOrTimestamp;
		if (result == null)
		{
			result = new MetadataString();
			this.partOrTimestamp = result;
		}
		return result;
	}

	public String getPartOrTimestamp()
	{
		return this.partOrTimestamp == null ? null : partOrTimestamp().getValue();
	}

	public MetadataString getPartOrTimestampMetadata()
	{
		return partOrTimestamp;
	}

	public void setPartOrTimestamp(String partOrTimestamp)
	{
		if (partOrTimestamp != null)
			this.partOrTimestamp().setValue(partOrTimestamp);
	}

	public void setPartOrTimestampMetadata(MetadataString partOrTimestamp)
	{
		this.partOrTimestamp = partOrTimestamp;
	}

	public MetadataParsedURL	videoDownloadLink()
	{
		MetadataParsedURL	result = this.videoDownloadLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.videoDownloadLink = result;
		}
		return result;
	}

	public ParsedURL getVideoDownloadLink()
	{
		return this.videoDownloadLink == null ? null : videoDownloadLink().getValue();
	}

	public MetadataParsedURL getVideoDownloadLinkMetadata()
	{
		return videoDownloadLink;
	}

	public void setVideoDownloadLink(ParsedURL videoDownloadLink)
	{
		if (videoDownloadLink != null)
			this.videoDownloadLink().setValue(videoDownloadLink);
	}

	public void setVideoDownloadLinkMetadata(MetadataParsedURL videoDownloadLink)
	{
		this.videoDownloadLink = videoDownloadLink;
	}

	public MetadataParsedURL	audioDownloadLink()
	{
		MetadataParsedURL	result = this.audioDownloadLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.audioDownloadLink = result;
		}
		return result;
	}

	public ParsedURL getAudioDownloadLink()
	{
		return this.audioDownloadLink == null ? null : audioDownloadLink().getValue();
	}

	public MetadataParsedURL getAudioDownloadLinkMetadata()
	{
		return audioDownloadLink;
	}

	public void setAudioDownloadLink(ParsedURL audioDownloadLink)
	{
		if (audioDownloadLink != null)
			this.audioDownloadLink().setValue(audioDownloadLink);
	}

	public void setAudioDownloadLinkMetadata(MetadataParsedURL audioDownloadLink)
	{
		this.audioDownloadLink = audioDownloadLink;
	}
}
