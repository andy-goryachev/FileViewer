// Copyright © 2011-2026 Andy Goryachev <andy@goryachev.com>
package goryachev.fdetect;
import goryachev.common.util.Keep;


@Keep
public enum FileType
{
	ASF
	{
		@Override
		public String getCode() { return "ASF"; }
//		public String getName() { return TXT.get("FileType.asf", "Windows ASF"); }
		@Override
		public boolean isVideo() { return true; }
	},
	AVI	
	{
		@Override
		public String getCode() { return "AVI"; }
//		public String getName() { return TXT.get("FileType.avi", "Windows AVI"); }
		@Override
		public boolean isVideo() { return true; }
	},
	BMP
	{
		@Override
		public String getCode() { return "BMP"; }
//		public String getName() { return TXT.get("FileType.bmp", "Windows Bitmap"); }
		@Override
		public boolean isImage() { return true; }
	},
	CLASS
	{
		@Override
		public String getCode() { return "CLASS"; }
//		public String getName() { return TXT.get("FileType.class", "Java Class"); }
	},
	DOC
	{
		@Override
		public String getCode() { return "DOC"; }
//		public String getName() { return TXT.get("FileType.doc", "MS Word Document"); }
	},
	DOCX
	{
		@Override
		public String getCode() { return "DOCX"; }
//		public String getName() { return TXT.get("FileType.docx", "MS Word Document"); }
	},
	EXE
	{
		@Override
		public String getCode() { return "EXE"; }
//		public String getName() { return TXT.get("FileType.exe", "Windows Executable"); }
	},
	FLV
	{
		@Override
		public String getCode() { return "FLV"; }
//		public String getName() { return TXT.get("FileType.flv", "Flash Video"); }
		@Override
		public boolean isVideo() { return true; }
	},
	GIF
	{
		@Override
		public String getCode() { return "GIF"; }
//		public String getName() { return TXT.get("FileType.gif", "GIF Image"); }
		@Override
		public boolean isImage() { return true; }
	},
	GZ
	{
		@Override
		public String getCode() { return "GZ"; }
//		public String getName() { return TXT.get("FileType.gz", "GZIP Archive"); }
	},
	HTML
	{
		@Override
		public String getCode() { return "HTML"; }
//		public String getName() { return TXT.get("FileType.html", "HTML File"); }
	},
	ICNS
	{
		@Override
		public String getCode() { return "ICNS"; }
//		public String getName() { return TXT.get("FileType.icns", "Apple Icon"); }
		@Override
		public boolean isImage() { return true; }
	},
	ICO
	{
		@Override
		public String getCode() { return "ICO"; }
//		public String getName() { return TXT.get("FileType.ico", "Windows Icon"); }
		@Override
		public boolean isImage() { return true; }
	},
	IFF
	{
		@Override
		public String getCode() { return "IFF"; }
//		public String getName() { return TXT.get("FileType.iff", "IFF Image"); }
		@Override
		public boolean isImage() { return true; }
	},
	JAR
	{
		@Override
		public String getCode() { return "JAR"; }
//		public String getName() { return TXT.get("FileType.jar", "JAR Archive"); }
	},
	JPEG
	{
		@Override
		public String getCode() { return "JPEG"; }
//		public String getName() { return TXT.get("FileType.jpeg", "JPEG Image"); }
		@Override
		public boolean isImage() { return true; }
	},
	M4A
	{
		@Override
		public String getCode() { return "M4A"; }
//		public String getName() { return TXT.get("FileType.m4a", "Apple Lossless Audio"); }
		@Override
		public boolean isAudio() { return true; }
	},
	MOV
	{
		@Override
		public String getCode() { return "MOV"; }
//		public String getName() { return TXT.get("FileType.mov", "QuickTime Movie"); }
		@Override
		public boolean isVideo() { return true; }
	},
	MP3
	{
		@Override
		public String getCode() { return "MP3"; }
//		public String getName() { return TXT.get("FileType.mp3", "MP3 Audio"); }
		@Override
		public boolean isAudio() { return true; }
	},
	MP4
	{
		@Override
		public String getCode() { return "MP4"; }
//		public String getName() { return TXT.get("FileType.mp4", "MPEG-4 Video"); }
		@Override
		public boolean isVideo() { return true; }
	},
	NETPBM
	{
		@Override
		public String getCode() { return "PPM"; }
//		public String getName() { return TXT.get("FileType.ppm", "Netpbm Image"); }
		@Override
		public boolean isImage() { return true; }
	},
	ODP
	{
		@Override
		public String getCode() { return "ODP"; }
//		public String getName() { return TXT.get("FileType.odp", "OpenOffice Presentation"); }
	},
	ODS
	{
		@Override
		public String getCode() { return "ODS"; }
//		public String getName() { return TXT.get("FileType.ods", "OpenOffice Spreadsheet"); }
	},
	ODT
	{
		@Override
		public String getCode() { return "ODT"; }
//		public String getName() { return TXT.get("FileType.odt", "OpenOffice Text Document"); }
	},
	OTF
	{
		@Override
		public String getCode() { return "OTF"; }
//		public String getName() { return TXT.get("FileType.otf", "Open Type Font"); }
	},
	OTT
	{
		@Override
		public String getCode() { return "OTT"; }
//		public String getName() { return TXT.get("FileType.ott", "OpenOffice Template"); }
	},
	PDF
	{
		@Override
		public String getCode() { return "PDF"; }
//		public String getName() { return TXT.get("FileType.pdf", "PDF Document"); }
	},
	PICT
	{
		@Override
		public String getCode() { return "PICT"; }
//		public String getName() { return TXT.get("FileType.pict", "Macintosh PICT"); }
		@Override
		public boolean isImage() { return true; }
	},
	PNG
	{
		@Override
		public String getCode() { return "PNG"; }
//		public String getName() { return TXT.get("FileType.png", "PNG Image"); }
		@Override
		public boolean isImage() { return true; }
	},
	PPT
	{
		@Override
		public String getCode() { return "PPT"; }
//		public String getName() { return TXT.get("FileType.ppt", "MS Office Presentation"); }
	},
	PPTX
	{
		@Override
		public String getCode() { return "PPTX"; }
//		public String getName() { return TXT.get("FileType.pptx", "MS Office Presentation"); }
	},
	PS
	{
		@Override
		public String getCode() { return "PS"; }
//		public String getName() { return TXT.get("FileType.ps", "PostScript"); }
	},
	PSD
	{
		@Override
		public String getCode() { return "PSD"; }
//		public String getName() { return TXT.get("FileType.psd", "Photoshop Image"); }
		@Override
		public boolean isImage() { return true; }
	},
	RAW
	{
		@Override
		public String getCode() { return "RAW"; }
//		public String getName() { return TXT.get("FileType.raw", "Raw Image"); }
		@Override
		public boolean isImage() { return true; }
	},
	RTF
	{
		@Override
		public String getCode() { return "RTF"; }
//		public String getName() { return TXT.get("FileType.rtf", "RTF Document"); }
	},
	SXC
	{
		@Override
		public String getCode() { return "SXC"; }
//		public String getName() { return TXT.get("FileType.sxc", "OpenOffice Spreadsheet"); }
	},
	SXD
	{
		@Override
		public String getCode() { return "SXD"; }
//		public String getName() { return TXT.get("FileType.sxd", "OpenOffice Drawing"); }
	},
	SXI
	{
		@Override
		public String getCode() { return "SXI"; }
//		public String getName() { return TXT.get("FileType.sxi", "OpenOffice Presentation"); }
	},
	SXW
	{
		@Override
		public String getCode() { return "SXW"; }
//		public String getName() { return TXT.get("FileType.sxw", "OpenOffice Writer Document"); }
	},
	SVG
	{
		@Override
		public String getCode() { return "SVG"; }
//		public String getName() { return TXT.get("FileType.svg", "SVG Image"); }
		@Override
		public boolean isImage() { return true; }
	},
	TEXT
	{
		@Override
		public String getCode() { return "TXT"; }
//		public String getName() { return TXT.get("FileType.text", "Text File"); }
	},
	TGP
	{
		@Override
		public String getCode() { return "3GP"; }
//		public String getName() { return TXT.get("FileType.3gp", "3GPP Multimedia"); }
		@Override
		public boolean isVideo() { return true; }
	},
	TIFF
	{
		@Override
		public String getCode() { return "TIFF"; }
//		public String getName() { return TXT.get("FileType.tiff", "TIFF Image"); }
		@Override
		public boolean isImage() { return true; }
	},
	TTF
	{
		@Override
		public String getCode() { return "TTF"; }
//		public String getName() { return TXT.get("FileType.ttf", "TrueType Font"); }
	},
	UNKNOWN
	{
		@Override
		public String getCode() { return "UNKNOWN"; }
//		public String getName() { return TXT.get("FileType.binary", "Binary File"); }
	},
	VSD
	{
		@Override
		public String getCode() { return "VSD"; }
//		public String getName() { return TXT.get("FileType.vsd", "MS Visio Diagram"); }
	},
	WAV
	{
		@Override
		public String getCode() { return "WAV"; }
//		public String getName() { return TXT.get("FileType.wav", "Windows WAV Audio"); }
		@Override
		public boolean isAudio() { return true; }
	},
	WMA
	{
		@Override
		public String getCode() { return "WMA"; }
//		public String getName() { return TXT.get("FileType.wma", "Windows WMA Audio"); }
		@Override
		public boolean isAudio() { return true; }
	},
	WMV
	{
		@Override
		public String getCode() { return "WMV"; }
//		public String getName() { return TXT.get("FileType.wmv", "Windows WMV Video"); }
		@Override
		public boolean isVideo() { return true; }
	},
	XLS
	{
		@Override
		public String getCode() { return "XLS"; }
//		public String getName() { return TXT.get("FileType.xls", "MS Excel Spreadsheet"); }
	},
	XLSX
	{
		@Override
		public String getCode() { return "XLSX"; }
//		public String getName() { return TXT.get("FileType.xlsx", "MS Excel Spreadsheet"); }
	},
	XML
	{
		@Override
		public String getCode() { return "XML"; }
//		public String getName() { return TXT.get("FileType.xml", "XML File"); }
	},
	ZIP
	{
		@Override
		public String getCode() { return "ZIP"; }
//		public String getName() { return TXT.get("FileType.zip", "ZIP Archive"); }
	};

	//
	
	public abstract String getCode();
	
//	public abstract String getName();
	
	public boolean isAudio() { return false; }
	
	public boolean isImage() { return false; }
	
	public boolean isVideo() { return false; }

	
	//
	
	
	public static FileType parse(Object x)
	{
		if(x instanceof FileType)
		{
			return (FileType)x;
		}
		else if(x != null)
		{
			String id = x.toString();
			for(FileType t: values())
			{
				if(t.getCode().equals(id))
				{
					return t;
				}
			}
		}
		return UNKNOWN;
	}
}
