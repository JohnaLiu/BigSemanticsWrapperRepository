//
//  Paragraph.cs
//  s.im.pl serialization
//
//  Generated by DotNetTranslator on 04/01/11.
//  Copyright 2011 Interface Ecology Lab. 
//

using System;
using System.Collections.Generic;
using Simpl.Serialization.Attributes;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metadata;

namespace ecologylab.semantics.generated.library 
{
	/// <summary>
	/// Paragraphs in the article.
	/// This is a generated code. DO NOT edit or modify it.
	/// @author MetadataCompiler
	/// </summary>
	[SimplDescriptorClasses(new Type[] { typeof(MetadataClassDescriptor), typeof(MetadataFieldDescriptor) })]
	[SimplInherit]
	public class Paragraph : Metadata
	{
		/// <summary>
		/// Anchors (links) in the paragraph, typically links to another Wikipedia article.
		/// </summary>
		[SimplCollection("anchor")]
		[SimplTag("anchors")]
		[mm_name("anchors")]
		private List<Anchor> anchors;

		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[SimplScalar]
		private MetadataString paragraphText;

		public Paragraph()
		{ }

		public List<Anchor> Anchors
		{
			get{return anchors;}
			set{anchors = value;}
		}

		public MetadataString ParagraphText
		{
			get{return paragraphText;}
			set{paragraphText = value;}
		}
	}
}
