//
//  Icdl.cs
//  s.im.pl serialization
//
//  Generated by DotNetTranslator on 11/10/10.
//  Copyright 2010 Interface Ecology Lab. 
//

using System;
using System.Collections.Generic;
using ecologylab.attributes;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;

namespace ecologylab.semantics.generated.library.icdl 
{
	/// <summary>
	/// The ICDL class
	/// </summary>
	[simpl_inherit]
    [simpl_descriptor_classes(new Type[] { typeof(MetadataClassDescriptor), typeof(MetadataFieldDescriptor) })]
	public class Icdl : Document
	{
		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_composite]
		[mm_name("response")]
		private Response response;

		public Icdl()
		{ }

		public Response Response
		{
			get{return response;}
			set{response = value;}
		}
	}
}
