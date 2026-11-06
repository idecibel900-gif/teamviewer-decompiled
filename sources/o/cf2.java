package o;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class cf2 {
    public static final String[] D;
    public static final int[] E;
    public static final byte[] F;
    public static final ze2 G;
    public static final ze2[][] H;
    public static final ze2[] I;
    public static final HashMap[] J;
    public static final HashMap[] K;
    public static final Set L;
    public static final HashMap M;
    public static final Charset N;
    public static final byte[] O;
    public static final byte[] P;
    public final FileDescriptor a;
    public int b;
    public final HashMap[] c;
    public final HashSet d;
    public ByteOrder e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public ye2 k;
    public static final boolean l = Log.isLoggable("ExifInterface", 3);
    public static final List m = Arrays.asList(1, 6, 3, 8);
    public static final List n = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f522o = {8, 8, 8};
    public static final int[] p = {8};
    public static final byte[] q = {-1, -40, -1};
    public static final byte[] r = {102, 116, 121, 112};
    public static final byte[] s = {109, 105, 102, 49};
    public static final byte[] t = {104, 101, 105, 99};
    public static final byte[] u = {97, 118, 105, 102};
    public static final byte[] v = {97, 118, 105, 115};
    public static final byte[] w = {79, 76, 89, 77, 80, 0};
    public static final byte[] x = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] y = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] z = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    public static final byte[] A = {82, 73, 70, 70};
    public static final byte[] B = {87, 69, 66, 80};
    public static final byte[] C = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        D = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        ze2[] ze2VarArr = {new ze2("NewSubfileType", 254, 4), new ze2("SubfileType", 255, 4), new ze2("ImageWidth", 256, 3, 4), new ze2("ImageLength", 257, 3, 4), new ze2("BitsPerSample", 258, 3), new ze2("Compression", 259, 3), new ze2("PhotometricInterpretation", 262, 3), new ze2("ImageDescription", 270, 2), new ze2("Make", 271, 2), new ze2("Model", 272, 2), new ze2("StripOffsets", 273, 3, 4), new ze2("Orientation", 274, 3), new ze2("SamplesPerPixel", 277, 3), new ze2("RowsPerStrip", 278, 3, 4), new ze2("StripByteCounts", 279, 3, 4), new ze2("XResolution", 282, 5), new ze2("YResolution", 283, 5), new ze2("PlanarConfiguration", 284, 3), new ze2("ResolutionUnit", 296, 3), new ze2("TransferFunction", 301, 3), new ze2("Software", 305, 2), new ze2("DateTime", 306, 2), new ze2("Artist", 315, 2), new ze2("WhitePoint", 318, 5), new ze2("PrimaryChromaticities", 319, 5), new ze2("SubIFDPointer", 330, 4), new ze2("JPEGInterchangeFormat", 513, 4), new ze2("JPEGInterchangeFormatLength", 514, 4), new ze2("YCbCrCoefficients", 529, 5), new ze2("YCbCrSubSampling", 530, 3), new ze2("YCbCrPositioning", 531, 3), new ze2("ReferenceBlackWhite", 532, 5), new ze2("Copyright", 33432, 2), new ze2("ExifIFDPointer", 34665, 4), new ze2("GPSInfoIFDPointer", 34853, 4), new ze2("SensorTopBorder", 4, 4), new ze2("SensorLeftBorder", 5, 4), new ze2("SensorBottomBorder", 6, 4), new ze2("SensorRightBorder", 7, 4), new ze2("ISO", 23, 3), new ze2("JpgFromRaw", 46, 7), new ze2("Xmp", 700, 1)};
        ze2[] ze2VarArr2 = {new ze2("ExposureTime", 33434, 5), new ze2("FNumber", 33437, 5), new ze2("ExposureProgram", 34850, 3), new ze2("SpectralSensitivity", 34852, 2), new ze2("PhotographicSensitivity", 34855, 3), new ze2("OECF", 34856, 7), new ze2("SensitivityType", 34864, 3), new ze2("StandardOutputSensitivity", 34865, 4), new ze2("RecommendedExposureIndex", 34866, 4), new ze2("ISOSpeed", 34867, 4), new ze2("ISOSpeedLatitudeyyy", 34868, 4), new ze2("ISOSpeedLatitudezzz", 34869, 4), new ze2("ExifVersion", 36864, 2), new ze2("DateTimeOriginal", 36867, 2), new ze2("DateTimeDigitized", 36868, 2), new ze2("OffsetTime", 36880, 2), new ze2("OffsetTimeOriginal", 36881, 2), new ze2("OffsetTimeDigitized", 36882, 2), new ze2("ComponentsConfiguration", 37121, 7), new ze2("CompressedBitsPerPixel", 37122, 5), new ze2("ShutterSpeedValue", 37377, 10), new ze2("ApertureValue", 37378, 5), new ze2("BrightnessValue", 37379, 10), new ze2("ExposureBiasValue", 37380, 10), new ze2("MaxApertureValue", 37381, 5), new ze2("SubjectDistance", 37382, 5), new ze2("MeteringMode", 37383, 3), new ze2("LightSource", 37384, 3), new ze2("Flash", 37385, 3), new ze2("FocalLength", 37386, 5), new ze2("SubjectArea", 37396, 3), new ze2("MakerNote", 37500, 7), new ze2("UserComment", 37510, 7), new ze2("SubSecTime", 37520, 2), new ze2("SubSecTimeOriginal", 37521, 2), new ze2("SubSecTimeDigitized", 37522, 2), new ze2("FlashpixVersion", 40960, 7), new ze2("ColorSpace", 40961, 3), new ze2("PixelXDimension", 40962, 3, 4), new ze2("PixelYDimension", 40963, 3, 4), new ze2("RelatedSoundFile", 40964, 2), new ze2("InteroperabilityIFDPointer", 40965, 4), new ze2("FlashEnergy", 41483, 5), new ze2("SpatialFrequencyResponse", 41484, 7), new ze2("FocalPlaneXResolution", 41486, 5), new ze2("FocalPlaneYResolution", 41487, 5), new ze2("FocalPlaneResolutionUnit", 41488, 3), new ze2("SubjectLocation", 41492, 3), new ze2("ExposureIndex", 41493, 5), new ze2("SensingMethod", 41495, 3), new ze2("FileSource", 41728, 7), new ze2("SceneType", 41729, 7), new ze2("CFAPattern", 41730, 7), new ze2("CustomRendered", 41985, 3), new ze2("ExposureMode", 41986, 3), new ze2("WhiteBalance", 41987, 3), new ze2("DigitalZoomRatio", 41988, 5), new ze2("FocalLengthIn35mmFilm", 41989, 3), new ze2("SceneCaptureType", 41990, 3), new ze2("GainControl", 41991, 3), new ze2("Contrast", 41992, 3), new ze2("Saturation", 41993, 3), new ze2("Sharpness", 41994, 3), new ze2("DeviceSettingDescription", 41995, 7), new ze2("SubjectDistanceRange", 41996, 3), new ze2("ImageUniqueID", 42016, 2), new ze2("CameraOwnerName", 42032, 2), new ze2("BodySerialNumber", 42033, 2), new ze2("LensSpecification", 42034, 5), new ze2("LensMake", 42035, 2), new ze2("LensModel", 42036, 2), new ze2("Gamma", 42240, 5), new ze2("DNGVersion", 50706, 1), new ze2("DefaultCropSize", 50720, 3, 4)};
        ze2[] ze2VarArr3 = {new ze2("GPSVersionID", 0, 1), new ze2("GPSLatitudeRef", 1, 2), new ze2("GPSLatitude", 2, 5, 10), new ze2("GPSLongitudeRef", 3, 2), new ze2("GPSLongitude", 4, 5, 10), new ze2("GPSAltitudeRef", 5, 1), new ze2("GPSAltitude", 6, 5), new ze2("GPSTimeStamp", 7, 5), new ze2("GPSSatellites", 8, 2), new ze2("GPSStatus", 9, 2), new ze2("GPSMeasureMode", 10, 2), new ze2("GPSDOP", 11, 5), new ze2("GPSSpeedRef", 12, 2), new ze2("GPSSpeed", 13, 5), new ze2("GPSTrackRef", 14, 2), new ze2("GPSTrack", 15, 5), new ze2("GPSImgDirectionRef", 16, 2), new ze2("GPSImgDirection", 17, 5), new ze2("GPSMapDatum", 18, 2), new ze2("GPSDestLatitudeRef", 19, 2), new ze2("GPSDestLatitude", 20, 5), new ze2("GPSDestLongitudeRef", 21, 2), new ze2("GPSDestLongitude", 22, 5), new ze2("GPSDestBearingRef", 23, 2), new ze2("GPSDestBearing", 24, 5), new ze2("GPSDestDistanceRef", 25, 2), new ze2("GPSDestDistance", 26, 5), new ze2("GPSProcessingMethod", 27, 7), new ze2("GPSAreaInformation", 28, 7), new ze2("GPSDateStamp", 29, 2), new ze2("GPSDifferential", 30, 3), new ze2("GPSHPositioningError", 31, 5)};
        ze2[] ze2VarArr4 = {new ze2("InteroperabilityIndex", 1, 2)};
        ze2[] ze2VarArr5 = {new ze2("NewSubfileType", 254, 4), new ze2("SubfileType", 255, 4), new ze2("ThumbnailImageWidth", 256, 3, 4), new ze2("ThumbnailImageLength", 257, 3, 4), new ze2("BitsPerSample", 258, 3), new ze2("Compression", 259, 3), new ze2("PhotometricInterpretation", 262, 3), new ze2("ImageDescription", 270, 2), new ze2("Make", 271, 2), new ze2("Model", 272, 2), new ze2("StripOffsets", 273, 3, 4), new ze2("ThumbnailOrientation", 274, 3), new ze2("SamplesPerPixel", 277, 3), new ze2("RowsPerStrip", 278, 3, 4), new ze2("StripByteCounts", 279, 3, 4), new ze2("XResolution", 282, 5), new ze2("YResolution", 283, 5), new ze2("PlanarConfiguration", 284, 3), new ze2("ResolutionUnit", 296, 3), new ze2("TransferFunction", 301, 3), new ze2("Software", 305, 2), new ze2("DateTime", 306, 2), new ze2("Artist", 315, 2), new ze2("WhitePoint", 318, 5), new ze2("PrimaryChromaticities", 319, 5), new ze2("SubIFDPointer", 330, 4), new ze2("JPEGInterchangeFormat", 513, 4), new ze2("JPEGInterchangeFormatLength", 514, 4), new ze2("YCbCrCoefficients", 529, 5), new ze2("YCbCrSubSampling", 530, 3), new ze2("YCbCrPositioning", 531, 3), new ze2("ReferenceBlackWhite", 532, 5), new ze2("Copyright", 33432, 2), new ze2("ExifIFDPointer", 34665, 4), new ze2("GPSInfoIFDPointer", 34853, 4), new ze2("DNGVersion", 50706, 1), new ze2("DefaultCropSize", 50720, 3, 4)};
        G = new ze2("StripOffsets", 273, 3);
        H = new ze2[][]{ze2VarArr, ze2VarArr2, ze2VarArr3, ze2VarArr4, ze2VarArr5, ze2VarArr, new ze2[]{new ze2("ThumbnailImage", 256, 7), new ze2("CameraSettingsIFDPointer", 8224, 4), new ze2("ImageProcessingIFDPointer", 8256, 4)}, new ze2[]{new ze2("PreviewImageStart", 257, 4), new ze2("PreviewImageLength", 258, 4)}, new ze2[]{new ze2("AspectFrame", 4371, 3)}, new ze2[]{new ze2("ColorSpace", 55, 3)}};
        I = new ze2[]{new ze2("SubIFDPointer", 330, 4), new ze2("ExifIFDPointer", 34665, 4), new ze2("GPSInfoIFDPointer", 34853, 4), new ze2("InteroperabilityIFDPointer", 40965, 4), new ze2("CameraSettingsIFDPointer", 8224, 1), new ze2("ImageProcessingIFDPointer", 8256, 1)};
        J = new HashMap[10];
        K = new HashMap[10];
        L = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        M = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        N = charsetForName;
        O = "Exif\u0000\u0000".getBytes(charsetForName);
        P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            ze2[][] ze2VarArr6 = H;
            if (i >= ze2VarArr6.length) {
                HashMap map = M;
                ze2[] ze2VarArr7 = I;
                map.put(Integer.valueOf(ze2VarArr7[0].a), 5);
                map.put(Integer.valueOf(ze2VarArr7[1].a), 1);
                map.put(Integer.valueOf(ze2VarArr7[2].a), 2);
                map.put(Integer.valueOf(ze2VarArr7[3].a), 3);
                map.put(Integer.valueOf(ze2VarArr7[4].a), 7);
                map.put(Integer.valueOf(ze2VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            J[i] = new HashMap();
            K[i] = new HashMap();
            for (ze2 ze2Var : ze2VarArr6[i]) {
                J[i].put(Integer.valueOf(ze2Var.a), ze2Var);
                K[i].put(ze2Var.b, ze2Var);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ad A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002e, blocks: (B:3:0x001f, B:5:0x0022, B:12:0x0037, B:18:0x0054, B:25:0x0067, B:31:0x007a, B:28:0x006f, B:29:0x0073, B:30:0x0077, B:32:0x0084, B:34:0x008d, B:36:0x0093, B:38:0x0099, B:40:0x009f, B:45:0x00ad), top: B:55:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public cf2(df2 df2Var) {
        ze2[][] ze2VarArr = H;
        this.c = new HashMap[ze2VarArr.length];
        this.d = new HashSet(ze2VarArr.length);
        this.e = ByteOrder.BIG_ENDIAN;
        boolean z2 = l;
        this.a = null;
        for (int i = 0; i < ze2VarArr.length; i++) {
            try {
                try {
                    this.c[i] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z2) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z2) {
                    io.sentry.android.core.v0.l("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z2) {
                    return;
                }
            } catch (UnsupportedOperationException e2) {
                e = e2;
                if (z2) {
                    io.sentry.android.core.v0.l("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z2) {
                    return;
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(df2Var, 5000);
        int iF = f(bufferedInputStream);
        this.b = iF;
        if (iF == 4 || iF == 9 || iF == 13 || iF == 14) {
            xe2 xe2Var = new xe2(bufferedInputStream);
            int i2 = this.b;
            if (i2 == 4) {
                e(xe2Var, 0, 0);
            } else if (i2 == 13) {
                h(xe2Var);
            } else if (i2 == 9) {
                i(xe2Var);
            } else if (i2 == 14) {
                l(xe2Var);
            }
        } else {
            bf2 bf2Var = new bf2(bufferedInputStream);
            int i3 = this.b;
            if (i3 == 12 || i3 == 15) {
                d(bf2Var, i3);
            } else if (i3 == 7) {
                g(bf2Var);
            } else if (i3 == 10) {
                k(bf2Var);
            } else {
                j(bf2Var);
            }
            bf2Var.j(this.g);
            u(bf2Var);
        }
        a();
        if (!z2) {
            return;
        }
        p();
    }

    public static ByteOrder q(xe2 xe2Var) throws IOException {
        short s2 = xe2Var.readShort();
        boolean z2 = l;
        if (s2 == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 != 19789) {
            io.sentry.h2.m(Integer.toHexString(s2), "Invalid byte order: ");
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.c;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(N);
            map.put("DateTime", new ye2(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", ye2.a(0L, this.e));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", ye2.a(0L, this.e));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", ye2.a(0L, this.e));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", ye2.a(0L, this.e));
        }
    }

    public final String b(String str) {
        ye2 ye2VarC = c(str);
        if (ye2VarC != null) {
            int i = ye2VarC.a;
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    io.sentry.android.core.v0.j("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                af2[] af2VarArr = (af2[]) ye2VarC.g(this.e);
                if (af2VarArr == null || af2VarArr.length != 3) {
                    io.sentry.android.core.v0.j("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(af2VarArr));
                    return null;
                }
                af2 af2Var = af2VarArr[0];
                Integer numValueOf = Integer.valueOf((int) (af2Var.a / af2Var.b));
                af2 af2Var2 = af2VarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (af2Var2.a / af2Var2.b));
                af2 af2Var3 = af2VarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (af2Var3.a / af2Var3.b)));
            }
            boolean zContains = L.contains(str);
            ByteOrder byteOrder = this.e;
            if (!zContains) {
                return ye2VarC.f(byteOrder);
            }
            try {
                return Double.toString(ye2VarC.d(byteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final ye2 c(String str) {
        ye2 ye2Var;
        int i;
        ye2 ye2Var2;
        if ("ISOSpeedRatings".equals(str)) {
            if (l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.b) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (ye2Var2 = this.k) != null)) {
            return ye2Var2;
        }
        for (int i2 = 0; i2 < H.length; i2++) {
            ye2 ye2Var3 = (ye2) this.c[i2].get(str);
            if (ye2Var3 != null) {
                return ye2Var3;
            }
        }
        if (!"Xmp".equals(str) || (ye2Var = this.k) == null) {
            return null;
        }
        return ye2Var;
    }

    public final void d(bf2 bf2Var, int i) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28) {
            yq4.r("Reading EXIF from HEIC files is supported from SDK 28 and above");
            return;
        }
        if (i == 15 && i3 < 31) {
            yq4.r("Reading EXIF from AVIF files is supported from SDK 31 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new we2(bf2Var));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.c;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", ye2.c(Integer.parseInt(strExtractMetadata), this.e));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", ye2.c(Integer.parseInt(strExtractMetadata3), this.e));
                }
                if (strExtractMetadata2 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata2);
                    if (i4 == 90) {
                        i2 = 6;
                    } else if (i4 != 180) {
                        i2 = i4 != 270 ? 1 : 8;
                    } else {
                        i2 = 3;
                    }
                    mapArr[0].put("Orientation", ye2.c(i2, this.e));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata4);
                    int i6 = Integer.parseInt(strExtractMetadata5);
                    if (i6 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    bf2Var.j(i5);
                    byte[] bArr = new byte[6];
                    bf2Var.readFully(bArr);
                    int i7 = i5 + 6;
                    int i8 = i6 - 6;
                    if (!Arrays.equals(bArr, O)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    bf2Var.readFully(bArr2);
                    this.g = i7;
                    r(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i9 = Integer.parseInt(strExtractMetadata8);
                    int i10 = Integer.parseInt(strExtractMetadata9);
                    long j = i9;
                    bf2Var.j(j);
                    byte[] bArr3 = new byte[i10];
                    bf2Var.readFully(bArr3);
                    this.k = new ye2(j, bArr3, 1, i10);
                }
                if (l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                try {
                    mediaMetadataRetriever.release();
                    throw th;
                } catch (IOException unused2) {
                    throw th;
                }
            }
        } catch (RuntimeException e) {
            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b0 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x015f A[LOOP:0: B:10:0x0034->B:56:0x015f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00a8. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1060)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void e(o.xe2 r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cf2.e(o.xe2, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:146:0x01a5  */
    public final int f(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        xe2 xe2Var;
        int i2;
        xe2 xe2Var2;
        int i3;
        int i4;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i5 = 0;
        while (true) {
            byte[] bArr2 = q;
            if (i5 >= bArr2.length) {
                return 4;
            }
            if (bArr[i5] != bArr2[i5]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i6 = 0; i6 < bytes.length; i6++) {
                    if (bArr[i6] != bytes[i6]) {
                        xe2 xe2Var3 = null;
                        try {
                            xe2Var = new xe2(bArr);
                            try {
                                try {
                                    long j2 = xe2Var.readInt();
                                    byte[] bArr3 = new byte[4];
                                    xe2Var.readFully(bArr3);
                                    if (Arrays.equals(bArr3, r)) {
                                        if (j2 == 1) {
                                            j2 = xe2Var.readLong();
                                            j = 16;
                                            if (j2 < 16) {
                                            }
                                            xe2Var.close();
                                            i = 0;
                                            i2 = 0;
                                        } else {
                                            j = 8;
                                        }
                                        if (j2 > 5000) {
                                            j2 = 5000;
                                        }
                                        long j3 = j2 - j;
                                        if (j3 < 8) {
                                            xe2Var.close();
                                            i = 0;
                                            i2 = 0;
                                        } else {
                                            byte[] bArr4 = new byte[4];
                                            long j4 = 0;
                                            boolean z2 = false;
                                            boolean z3 = false;
                                            boolean z4 = false;
                                            while (true) {
                                                if (j4 < j3 / 4) {
                                                    try {
                                                        xe2Var.readFully(bArr4);
                                                        if (j4 != 1) {
                                                            i = 0;
                                                            try {
                                                                if (Arrays.equals(bArr4, s)) {
                                                                    z2 = true;
                                                                } else if (Arrays.equals(bArr4, t)) {
                                                                    z3 = true;
                                                                } else if (Arrays.equals(bArr4, u) || Arrays.equals(bArr4, v)) {
                                                                    z4 = true;
                                                                }
                                                                if (!z2) {
                                                                    continue;
                                                                } else if (z3) {
                                                                    xe2Var.close();
                                                                    i2 = 12;
                                                                } else if (z4) {
                                                                    xe2Var.close();
                                                                    i2 = 15;
                                                                }
                                                            } catch (Exception e) {
                                                                e = e;
                                                                if (l) {
                                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                                }
                                                                if (xe2Var != null) {
                                                                    xe2Var.close();
                                                                }
                                                                i2 = i;
                                                            }
                                                        }
                                                        j4++;
                                                    } catch (EOFException unused) {
                                                        i = 0;
                                                        xe2Var.close();
                                                        i2 = i;
                                                    }
                                                } else {
                                                    i = 0;
                                                }
                                                xe2Var.close();
                                                i2 = i;
                                            }
                                        }
                                    } else {
                                        xe2Var.close();
                                        i = 0;
                                        i2 = 0;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                xe2Var3 = xe2Var;
                                if (xe2Var3 != null) {
                                    xe2Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            i = 0;
                            xe2Var = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (xe2Var3 != null) {
                                xe2Var3.close();
                            }
                            throw th;
                        }
                        if (i2 != 0) {
                            return i2;
                        }
                        try {
                            xe2Var2 = new xe2(bArr);
                            try {
                                ByteOrder byteOrderQ = q(xe2Var2);
                                this.e = byteOrderQ;
                                xe2Var2.f2510o = byteOrderQ;
                                short s2 = xe2Var2.readShort();
                                i3 = (s2 == 20306 || s2 == 21330) ? 1 : i;
                                xe2Var2.close();
                            } catch (Exception unused2) {
                                if (xe2Var2 != null) {
                                    xe2Var2.close();
                                }
                                i3 = i;
                            } catch (Throwable th3) {
                                th = th3;
                                xe2Var3 = xe2Var2;
                                if (xe2Var3 != null) {
                                    xe2Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused3) {
                            xe2Var2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        if (i3 != 0) {
                            return 7;
                        }
                        try {
                            xe2 xe2Var4 = new xe2(bArr);
                            try {
                                ByteOrder byteOrderQ2 = q(xe2Var4);
                                this.e = byteOrderQ2;
                                xe2Var4.f2510o = byteOrderQ2;
                                i4 = xe2Var4.readShort() != 85 ? i : 1;
                                xe2Var4.close();
                            } catch (Exception unused4) {
                                xe2Var3 = xe2Var4;
                                if (xe2Var3 != null) {
                                    xe2Var3.close();
                                }
                                i4 = i;
                            } catch (Throwable th5) {
                                th = th5;
                                xe2Var3 = xe2Var4;
                                if (xe2Var3 != null) {
                                    xe2Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused5) {
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        if (i4 != 0) {
                            return 10;
                        }
                        int i7 = i;
                        while (true) {
                            byte[] bArr5 = y;
                            if (i7 >= bArr5.length) {
                                return 13;
                            }
                            if (bArr[i7] != bArr5[i7]) {
                                int i8 = i;
                                while (true) {
                                    byte[] bArr6 = A;
                                    if (i8 >= bArr6.length) {
                                        int i9 = i;
                                        while (true) {
                                            byte[] bArr7 = B;
                                            if (i9 >= bArr7.length) {
                                                return 14;
                                            }
                                            if (bArr[bArr6.length + i9 + 4] != bArr7[i9]) {
                                                break;
                                            }
                                            i9++;
                                        }
                                    } else {
                                        if (bArr[i8] != bArr6[i8]) {
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                return i;
                            }
                            i7++;
                        }
                    }
                }
                return 9;
            }
            i5++;
        }
    }

    public final void g(bf2 bf2Var) throws Throwable {
        int i;
        int i2;
        j(bf2Var);
        HashMap[] mapArr = this.c;
        ye2 ye2Var = (ye2) mapArr[1].get("MakerNote");
        if (ye2Var != null) {
            bf2 bf2Var2 = new bf2(ye2Var.d);
            bf2Var2.f2510o = this.e;
            byte[] bArr = w;
            byte[] bArr2 = new byte[bArr.length];
            bf2Var2.readFully(bArr2);
            bf2Var2.j(0L);
            byte[] bArr3 = x;
            byte[] bArr4 = new byte[bArr3.length];
            bf2Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bf2Var2.j(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bf2Var2.j(12L);
            }
            s(bf2Var2, 6);
            ye2 ye2Var2 = (ye2) mapArr[7].get("PreviewImageStart");
            ye2 ye2Var3 = (ye2) mapArr[7].get("PreviewImageLength");
            if (ye2Var2 != null && ye2Var3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", ye2Var2);
                mapArr[5].put("JPEGInterchangeFormatLength", ye2Var3);
            }
            ye2 ye2Var4 = (ye2) mapArr[8].get("AspectFrame");
            if (ye2Var4 != null) {
                int[] iArr = (int[]) ye2Var4.g(this.e);
                if (iArr == null || iArr.length != 4) {
                    io.sentry.android.core.v0.j("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                ye2 ye2VarC = ye2.c(i5, this.e);
                ye2 ye2VarC2 = ye2.c(i6, this.e);
                mapArr[0].put("ImageWidth", ye2VarC);
                mapArr[0].put("ImageLength", ye2VarC2);
            }
        }
    }

    public final void h(xe2 xe2Var) throws Throwable {
        if (l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + xe2Var);
        }
        xe2Var.f2510o = ByteOrder.BIG_ENDIAN;
        int i = xe2Var.n;
        xe2Var.e(y.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                return;
            }
            try {
                int i2 = xe2Var.readInt();
                int i3 = xe2Var.readInt();
                int i4 = xe2Var.n;
                int i5 = i4 + i2 + 4;
                int i6 = i4 - i;
                if (i6 == 16 && i3 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i3 == 1229278788) {
                    return;
                }
                if (i3 == 1700284774 && !z2) {
                    this.g = i6;
                    byte[] bArr = new byte[i2];
                    xe2Var.readFully(bArr);
                    int i7 = xe2Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i3 >>> 24);
                    crc32.update(i3 >>> 16);
                    crc32.update(i3 >>> 8);
                    crc32.update(i3);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i7) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i7 + ", calculated CRC value: " + crc32.getValue());
                    }
                    r(bArr, 0);
                    x();
                    u(new xe2(bArr));
                    z2 = true;
                } else if (i3 == 1767135348 && !z3) {
                    byte[] bArr2 = z;
                    if (i2 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        xe2Var.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i8 = xe2Var.n - i;
                            int i9 = i2 - length;
                            byte[] bArr4 = new byte[i9];
                            xe2Var.readFully(bArr4);
                            this.k = new ye2(i8, bArr4, 1, i9);
                            z3 = true;
                        }
                    }
                }
                xe2Var.e(i5 - xe2Var.n);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
    }

    public final void i(xe2 xe2Var) throws Throwable {
        boolean z2 = l;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + xe2Var);
        }
        xe2Var.e(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        xe2Var.readFully(bArr);
        xe2Var.readFully(bArr2);
        xe2Var.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        xe2Var.e(i - xe2Var.n);
        xe2Var.readFully(bArr4);
        e(new xe2(bArr4), i, 5);
        xe2Var.e(i3 - xe2Var.n);
        xe2Var.f2510o = ByteOrder.BIG_ENDIAN;
        int i4 = xe2Var.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = xe2Var.readUnsignedShort();
            int unsignedShort2 = xe2Var.readUnsignedShort();
            if (unsignedShort == G.a) {
                short s2 = xe2Var.readShort();
                short s3 = xe2Var.readShort();
                ye2 ye2VarC = ye2.c(s2, this.e);
                ye2 ye2VarC2 = ye2.c(s3, this.e);
                HashMap[] mapArr = this.c;
                mapArr[0].put("ImageLength", ye2VarC);
                mapArr[0].put("ImageWidth", ye2VarC2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s2) + ", width: " + ((int) s3));
                    return;
                }
                return;
            }
            xe2Var.e(unsignedShort2);
        }
    }

    public final void j(bf2 bf2Var) throws Throwable {
        o(bf2Var);
        s(bf2Var, 0);
        w(bf2Var, 0);
        w(bf2Var, 5);
        w(bf2Var, 4);
        x();
        if (this.b == 8) {
            HashMap[] mapArr = this.c;
            ye2 ye2Var = (ye2) mapArr[1].get("MakerNote");
            if (ye2Var != null) {
                bf2 bf2Var2 = new bf2(ye2Var.d);
                bf2Var2.f2510o = this.e;
                bf2Var2.e(6);
                s(bf2Var2, 9);
                ye2 ye2Var2 = (ye2) mapArr[9].get("ColorSpace");
                if (ye2Var2 != null) {
                    mapArr[1].put("ColorSpace", ye2Var2);
                }
            }
        }
    }

    public final void k(bf2 bf2Var) throws Throwable {
        if (l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + bf2Var);
        }
        j(bf2Var);
        HashMap[] mapArr = this.c;
        ye2 ye2Var = (ye2) mapArr[0].get("JpgFromRaw");
        if (ye2Var != null) {
            e(new xe2(ye2Var.d), (int) ye2Var.c, 5);
        }
        ye2 ye2Var2 = (ye2) mapArr[0].get("ISO");
        ye2 ye2Var3 = (ye2) mapArr[1].get("PhotographicSensitivity");
        if (ye2Var2 == null || ye2Var3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", ye2Var2);
    }

    public final void l(xe2 xe2Var) throws Throwable {
        if (l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + xe2Var);
        }
        xe2Var.f2510o = ByteOrder.LITTLE_ENDIAN;
        xe2Var.e(A.length);
        int i = xe2Var.readInt() + 8;
        byte[] bArr = B;
        xe2Var.e(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                xe2Var.readFully(bArr2);
                int i2 = xe2Var.readInt();
                int i3 = length + 8;
                if (Arrays.equals(C, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i2];
                    xe2Var.readFully(bArrCopyOfRange);
                    byte[] bArr3 = O;
                    if (it1.L(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i2);
                    }
                    this.g = i3;
                    r(bArrCopyOfRange, 0);
                    u(new xe2(bArrCopyOfRange));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                xe2Var.e(i2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void m(xe2 xe2Var, HashMap map) throws Throwable {
        ye2 ye2Var = (ye2) map.get("JPEGInterchangeFormat");
        ye2 ye2Var2 = (ye2) map.get("JPEGInterchangeFormatLength");
        if (ye2Var == null || ye2Var2 == null) {
            return;
        }
        int iE = ye2Var.e(this.e);
        int iE2 = ye2Var2.e(this.e);
        if (this.b == 7) {
            iE += this.h;
        }
        if (iE > 0 && iE2 > 0 && this.a == null) {
            xe2Var.e(iE);
            xe2Var.readFully(new byte[iE2]);
        }
        if (l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    public final boolean n(HashMap map) {
        ye2 ye2Var = (ye2) map.get("ImageLength");
        ye2 ye2Var2 = (ye2) map.get("ImageWidth");
        if (ye2Var == null || ye2Var2 == null) {
            return false;
        }
        return ye2Var.e(this.e) <= 512 && ye2Var2.e(this.e) <= 512;
    }

    public final void o(bf2 bf2Var) throws IOException {
        ByteOrder byteOrderQ = q(bf2Var);
        this.e = byteOrderQ;
        bf2Var.f2510o = byteOrderQ;
        int unsignedShort = bf2Var.readUnsignedShort();
        int i = this.b;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            io.sentry.h2.m(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = bf2Var.readInt();
        if (i2 < 8) {
            gk0.l(fx3.e(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            bf2Var.e(i3);
        }
    }

    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.c;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbK = fx3.k(i, "The size of tag group[", "]: ");
            sbK.append(mapArr[i].size());
            Log.d("ExifInterface", sbK.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                ye2 ye2Var = (ye2) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + ye2Var.toString() + ", tagValue: '" + ye2Var.f(this.e) + "'");
            }
            i++;
        }
    }

    public final void r(byte[] bArr, int i) throws IOException {
        bf2 bf2Var = new bf2(bArr);
        o(bf2Var);
        s(bf2Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0210  */
    /* JADX WARN: Code duplicated, block: B:103:0x0214  */
    /* JADX WARN: Code duplicated, block: B:108:0x0221  */
    /* JADX WARN: Code duplicated, block: B:109:0x0226  */
    /* JADX WARN: Code duplicated, block: B:110:0x0232  */
    /* JADX WARN: Code duplicated, block: B:112:0x0239  */
    /* JADX WARN: Code duplicated, block: B:115:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x025b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0299  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:132:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:134:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:139:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:148:0x0328  */
    /* JADX WARN: Code duplicated, block: B:175:0x032b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0181  */
    /* JADX WARN: Code duplicated, block: B:82:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x0194  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0206  */
    /* JADX WARN: Code duplicated, block: B:97:0x0209  */
    /* JADX WARN: Code duplicated, block: B:99:0x020c  */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x02a1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0166, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01eb, please report this as an issue */
    public final void s(bf2 bf2Var, int i) throws IOException {
        HashMap[] mapArr;
        long j;
        long j2;
        boolean z2;
        int i2;
        long j3;
        Integer num;
        HashSet hashSet;
        long j4;
        String str;
        int unsignedShort;
        long j5;
        String strG;
        int i3;
        int i4 = bf2Var.n;
        int i5 = bf2Var.q;
        Integer numValueOf = Integer.valueOf(i4);
        HashSet hashSet2 = this.d;
        hashSet2.add(numValueOf);
        short s2 = bf2Var.readShort();
        boolean z3 = l;
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s2));
        }
        if (s2 <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            mapArr = this.c;
            if (s3 >= s2) {
                break;
            }
            int unsignedShort2 = bf2Var.readUnsignedShort();
            int unsignedShort3 = bf2Var.readUnsignedShort();
            int i6 = bf2Var.readInt();
            long j6 = ((long) bf2Var.n) + 4;
            short s4 = s2;
            ze2 ze2Var = (ze2) J[i].get(Integer.valueOf(unsignedShort2));
            if (z3) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), ze2Var != null ? ze2Var.b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i6)));
            }
            if (ze2Var != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = E;
                    if (unsignedShort3 < iArr.length) {
                        byte b = ze2Var.c;
                        if (b == 7 || unsignedShort3 == 7 || b == unsignedShort3 || (i2 = ze2Var.d) == unsignedShort3 || (((b == 4 || i2 == 4) && unsignedShort3 == 3) || (((b == 9 || i2 == 9) && unsignedShort3 == 8) || ((b == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = b;
                            }
                            j = j6;
                            j2 = ((long) i6) * ((long) iArr[unsignedShort3]);
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i6);
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + D[unsignedShort3] + ") is unexpected for tag: " + ze2Var.b);
                        }
                    }
                    if (z2) {
                        j3 = j;
                        if (j2 > 4) {
                            i3 = bf2Var.readInt();
                            if (z3 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i3);
                            }
                            if (this.b == 7) {
                                if ("MakerNote".equals(ze2Var.b)) {
                                    this.h = i3;
                                } else if (i != 6 && "ThumbnailImage".equals(ze2Var.b)) {
                                    this.i = i3;
                                    this.j = i6;
                                    ye2 ye2VarC = ye2.c(6, this.e);
                                    ye2 ye2VarA = ye2.a(this.i, this.e);
                                    ye2 ye2VarA2 = ye2.a(this.j, this.e);
                                    mapArr[4].put("Compression", ye2VarC);
                                    mapArr[4].put("JPEGInterchangeFormat", ye2VarA);
                                    mapArr[4].put("JPEGInterchangeFormatLength", ye2VarA2);
                                }
                            }
                            bf2Var.j(i3);
                        } else {
                            j3 = j3;
                            unsignedShort2 = unsignedShort2;
                            ze2Var = ze2Var;
                        }
                        num = (Integer) M.get(Integer.valueOf(unsignedShort2));
                        if (z3 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    j5 = ((long) bf2Var.readInt()) & 4294967295L;
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = bf2Var.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = bf2Var.readInt();
                                } else {
                                    j5 = -1;
                                }
                                if (z3 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), ze2Var.b));
                                }
                                if (j5 > 0 || (i5 != -1 && j5 >= i5)) {
                                    hashSet = hashSet2;
                                    if (z3 != 0) {
                                        strG = e41.g("Skip jump into the IFD since its offset is invalid: ", j5);
                                        if (i5 != -1) {
                                            strG = strG + " (total length: " + i5 + ")";
                                        }
                                        Log.d("ExifInterface", strG);
                                    }
                                } else {
                                    hashSet = hashSet2;
                                    if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                        bf2Var.j(j5);
                                        s(bf2Var, num.intValue());
                                    } else if (z3 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                    }
                                }
                                bf2Var.j(j3);
                            } else {
                                unsignedShort = bf2Var.readUnsignedShort();
                            }
                            j5 = unsignedShort;
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), ze2Var.b));
                            }
                            if (j5 > 0) {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strG = e41.g("Skip jump into the IFD since its offset is invalid: ", j5);
                                    if (i5 != -1) {
                                        strG = strG + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strG);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strG = e41.g("Skip jump into the IFD since its offset is invalid: ", j5);
                                    if (i5 != -1) {
                                        strG = strG + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strG);
                                }
                            }
                            bf2Var.j(j3);
                        } else {
                            hashSet = hashSet2;
                            j4 = j3;
                            int i7 = bf2Var.n + this.g;
                            byte[] bArr = new byte[(int) j2];
                            bf2Var.readFully(bArr);
                            ye2 ye2Var = new ye2(i7, bArr, unsignedShort3, i6);
                            HashMap map = mapArr[i];
                            str = ze2Var.b;
                            map.put(str, ye2Var);
                            if ("DNGVersion".equals(str)) {
                                this.b = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && ye2Var.f(this.e).contains("PENTAX")) || ("Compression".equals(str) && ye2Var.e(this.e) == 65535)) {
                                this.b = 8;
                            }
                            if (bf2Var.n != j4) {
                                bf2Var.j(j4);
                            }
                        }
                    } else {
                        bf2Var.j(j);
                        hashSet = hashSet2;
                    }
                    s3 = (short) (s3 + 1);
                    hashSet2 = hashSet;
                    s2 = s4;
                    z3 = z3;
                }
                j = j6;
                if (z3 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j2 = 0;
                z2 = false;
                if (z2) {
                    bf2Var.j(j);
                    hashSet = hashSet2;
                } else {
                    j3 = j;
                    if (j2 > 4) {
                        i3 = bf2Var.readInt();
                        if (z3 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i3);
                        }
                        if (this.b == 7) {
                            if ("MakerNote".equals(ze2Var.b)) {
                                this.h = i3;
                            } else if (i != 6) {
                            }
                        }
                        bf2Var.j(i3);
                    } else {
                        j3 = j3;
                        unsignedShort2 = unsignedShort2;
                        ze2Var = ze2Var;
                    }
                    num = (Integer) M.get(Integer.valueOf(unsignedShort2));
                    if (z3 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                j5 = ((long) bf2Var.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = bf2Var.readInt();
                            } else {
                                unsignedShort = bf2Var.readShort();
                            }
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), ze2Var.b));
                            }
                            if (j5 > 0) {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strG = e41.g("Skip jump into the IFD since its offset is invalid: ", j5);
                                    if (i5 != -1) {
                                        strG = strG + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strG);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strG = e41.g("Skip jump into the IFD since its offset is invalid: ", j5);
                                    if (i5 != -1) {
                                        strG = strG + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strG);
                                }
                            }
                            bf2Var.j(j3);
                        } else {
                            unsignedShort = bf2Var.readUnsignedShort();
                        }
                        j5 = unsignedShort;
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), ze2Var.b));
                        }
                        if (j5 > 0) {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strG = e41.g("Skip jump into the IFD since its offset is invalid: ", j5);
                                if (i5 != -1) {
                                    strG = strG + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strG);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strG = e41.g("Skip jump into the IFD since its offset is invalid: ", j5);
                                if (i5 != -1) {
                                    strG = strG + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strG);
                            }
                        }
                        bf2Var.j(j3);
                    } else {
                        hashSet = hashSet2;
                        j4 = j3;
                        int i8 = bf2Var.n + this.g;
                        byte[] bArr2 = new byte[(int) j2];
                        bf2Var.readFully(bArr2);
                        ye2 ye2Var2 = new ye2(i8, bArr2, unsignedShort3, i6);
                        HashMap map2 = mapArr[i];
                        str = ze2Var.b;
                        map2.put(str, ye2Var2);
                        if ("DNGVersion".equals(str)) {
                            this.b = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.b = 8;
                        if (bf2Var.n != j4) {
                            bf2Var.j(j4);
                        }
                    }
                }
                s3 = (short) (s3 + 1);
                hashSet2 = hashSet;
                s2 = s4;
                z3 = z3;
            } else if (z3) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j = j6;
            j2 = 0;
            z2 = false;
            if (z2) {
                bf2Var.j(j);
                hashSet = hashSet2;
            } else {
                j3 = j;
                if (j2 > 4) {
                    i3 = bf2Var.readInt();
                    if (z3 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i3);
                    }
                    if (this.b == 7) {
                        if ("MakerNote".equals(ze2Var.b)) {
                            this.h = i3;
                        } else if (i != 6) {
                        }
                    }
                    bf2Var.j(i3);
                } else {
                    j3 = j3;
                    unsignedShort2 = unsignedShort2;
                    ze2Var = ze2Var;
                }
                num = (Integer) M.get(Integer.valueOf(unsignedShort2));
                if (z3 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j5 = ((long) bf2Var.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = bf2Var.readInt();
                        } else {
                            unsignedShort = bf2Var.readShort();
                        }
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), ze2Var.b));
                        }
                        if (j5 > 0) {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strG = e41.g("Skip jump into the IFD since its offset is invalid: ", j5);
                                if (i5 != -1) {
                                    strG = strG + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strG);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strG = e41.g("Skip jump into the IFD since its offset is invalid: ", j5);
                                if (i5 != -1) {
                                    strG = strG + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strG);
                            }
                        }
                        bf2Var.j(j3);
                    } else {
                        unsignedShort = bf2Var.readUnsignedShort();
                    }
                    j5 = unsignedShort;
                    if (z3 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), ze2Var.b));
                    }
                    if (j5 > 0) {
                        hashSet = hashSet2;
                        if (z3 != 0) {
                            strG = e41.g("Skip jump into the IFD since its offset is invalid: ", j5);
                            if (i5 != -1) {
                                strG = strG + " (total length: " + i5 + ")";
                            }
                            Log.d("ExifInterface", strG);
                        }
                    } else {
                        hashSet = hashSet2;
                        if (z3 != 0) {
                            strG = e41.g("Skip jump into the IFD since its offset is invalid: ", j5);
                            if (i5 != -1) {
                                strG = strG + " (total length: " + i5 + ")";
                            }
                            Log.d("ExifInterface", strG);
                        }
                    }
                    bf2Var.j(j3);
                } else {
                    hashSet = hashSet2;
                    j4 = j3;
                    int i9 = bf2Var.n + this.g;
                    byte[] bArr3 = new byte[(int) j2];
                    bf2Var.readFully(bArr3);
                    ye2 ye2Var3 = new ye2(i9, bArr3, unsignedShort3, i6);
                    HashMap map3 = mapArr[i];
                    str = ze2Var.b;
                    map3.put(str, ye2Var3);
                    if ("DNGVersion".equals(str)) {
                        this.b = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.b = 8;
                    if (bf2Var.n != j4) {
                        bf2Var.j(j4);
                    }
                }
            }
            s3 = (short) (s3 + 1);
            hashSet2 = hashSet;
            s2 = s4;
            z3 = z3;
        }
        HashSet hashSet3 = hashSet2;
        boolean z4 = z3;
        int i10 = bf2Var.readInt();
        if (z4) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i10)));
        }
        long j7 = i10;
        if (j7 <= 0) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        if (hashSet3.contains(Integer.valueOf(i10))) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        bf2Var.j(j7);
        if (mapArr[4].isEmpty()) {
            s(bf2Var, 4);
        } else if (mapArr[5].isEmpty()) {
            s(bf2Var, 5);
        }
    }

    public final void t(int i, String str, String str2) {
        HashMap[] mapArr = this.c;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, (ye2) map.get(str));
        mapArr[i].remove(str);
    }

    public final void u(xe2 xe2Var) throws Throwable {
        ye2 ye2Var;
        int iE;
        HashMap map = this.c[4];
        ye2 ye2Var2 = (ye2) map.get("Compression");
        if (ye2Var2 == null) {
            m(xe2Var, map);
            return;
        }
        int iE2 = ye2Var2.e(this.e);
        if (iE2 != 1) {
            if (iE2 == 6) {
                m(xe2Var, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        ye2 ye2Var3 = (ye2) map.get("BitsPerSample");
        if (ye2Var3 != null) {
            int[] iArr = (int[]) ye2Var3.g(this.e);
            int[] iArr2 = f522o;
            if (Arrays.equals(iArr2, iArr) || (this.b == 3 && (ye2Var = (ye2) map.get("PhotometricInterpretation")) != null && (((iE = ye2Var.e(this.e)) == 1 && Arrays.equals(iArr, p)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                ye2 ye2Var4 = (ye2) map.get("StripOffsets");
                ye2 ye2Var5 = (ye2) map.get("StripByteCounts");
                if (ye2Var4 == null || ye2Var5 == null) {
                    return;
                }
                long[] jArrV = it1.v(ye2Var4.g(this.e));
                long[] jArrV2 = it1.v(ye2Var5.g(this.e));
                if (jArrV == null || jArrV.length == 0) {
                    io.sentry.android.core.v0.j("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrV2 == null || jArrV2.length == 0) {
                    io.sentry.android.core.v0.j("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrV.length != jArrV2.length) {
                    io.sentry.android.core.v0.j("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrV2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrV.length; i3++) {
                    int i4 = (int) jArrV[i3];
                    int i5 = (int) jArrV2[i3];
                    if (i3 < jArrV.length - 1 && i4 + i5 != jArrV[i3 + 1]) {
                        this.f = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        xe2Var.e(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        try {
                            xe2Var.readFully(bArr2);
                            i = i7 + i5;
                            System.arraycopy(bArr2, 0, bArr, i2, i5);
                            i2 += i5;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                }
                if (this.f) {
                    long j3 = jArrV[0];
                    return;
                }
                return;
            }
        }
        if (l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.c;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z2 = l;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        ye2 ye2Var = (ye2) mapArr[i].get("ImageLength");
        ye2 ye2Var2 = (ye2) mapArr[i].get("ImageWidth");
        ye2 ye2Var3 = (ye2) mapArr[i2].get("ImageLength");
        ye2 ye2Var4 = (ye2) mapArr[i2].get("ImageWidth");
        if (ye2Var == null || ye2Var2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (ye2Var3 == null || ye2Var4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iE = ye2Var.e(this.e);
        int iE2 = ye2Var2.e(this.e);
        int iE3 = ye2Var3.e(this.e);
        int iE4 = ye2Var4.e(this.e);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void w(bf2 bf2Var, int i) throws Throwable {
        ye2 ye2VarC;
        ye2 ye2VarC2;
        HashMap[] mapArr = this.c;
        ye2 ye2Var = (ye2) mapArr[i].get("DefaultCropSize");
        ye2 ye2Var2 = (ye2) mapArr[i].get("SensorTopBorder");
        ye2 ye2Var3 = (ye2) mapArr[i].get("SensorLeftBorder");
        ye2 ye2Var4 = (ye2) mapArr[i].get("SensorBottomBorder");
        ye2 ye2Var5 = (ye2) mapArr[i].get("SensorRightBorder");
        if (ye2Var != null) {
            int i2 = ye2Var.a;
            ByteOrder byteOrder = this.e;
            if (i2 == 5) {
                af2[] af2VarArr = (af2[]) ye2Var.g(byteOrder);
                if (af2VarArr == null || af2VarArr.length != 2) {
                    io.sentry.android.core.v0.j("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(af2VarArr));
                    return;
                }
                ye2VarC = ye2.b(af2VarArr[0], this.e);
                ye2VarC2 = ye2.b(af2VarArr[1], this.e);
            } else {
                int[] iArr = (int[]) ye2Var.g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    io.sentry.android.core.v0.j("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                ye2VarC = ye2.c(iArr[0], this.e);
                ye2VarC2 = ye2.c(iArr[1], this.e);
            }
            mapArr[i].put("ImageWidth", ye2VarC);
            mapArr[i].put("ImageLength", ye2VarC2);
            return;
        }
        if (ye2Var2 != null && ye2Var3 != null && ye2Var4 != null && ye2Var5 != null) {
            int iE = ye2Var2.e(this.e);
            int iE2 = ye2Var4.e(this.e);
            int iE3 = ye2Var5.e(this.e);
            int iE4 = ye2Var3.e(this.e);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            ye2 ye2VarC3 = ye2.c(iE2 - iE, this.e);
            ye2 ye2VarC4 = ye2.c(iE3 - iE4, this.e);
            mapArr[i].put("ImageLength", ye2VarC3);
            mapArr[i].put("ImageWidth", ye2VarC4);
            return;
        }
        ye2 ye2Var6 = (ye2) mapArr[i].get("ImageLength");
        ye2 ye2Var7 = (ye2) mapArr[i].get("ImageWidth");
        if (ye2Var6 == null || ye2Var7 == null) {
            ye2 ye2Var8 = (ye2) mapArr[i].get("JPEGInterchangeFormat");
            ye2 ye2Var9 = (ye2) mapArr[i].get("JPEGInterchangeFormatLength");
            if (ye2Var8 == null || ye2Var9 == null) {
                return;
            }
            int iE5 = ye2Var8.e(this.e);
            int iE6 = ye2Var8.e(this.e);
            bf2Var.j(iE5);
            byte[] bArr = new byte[iE6];
            bf2Var.readFully(bArr);
            e(new xe2(bArr), iE5, i);
        }
    }

    public final void x() throws Throwable {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] mapArr = this.c;
        ye2 ye2Var = (ye2) mapArr[1].get("PixelXDimension");
        ye2 ye2Var2 = (ye2) mapArr[1].get("PixelYDimension");
        if (ye2Var != null && ye2Var2 != null) {
            mapArr[0].put("ImageWidth", ye2Var);
            mapArr[0].put("ImageLength", ye2Var2);
        }
        if (mapArr[4].isEmpty() && n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
