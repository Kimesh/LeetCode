import java.util.HashMap;
import java.util.UUID;

public class Codec {

	HashMap<String,String> encodeMap=new HashMap<>();
	HashMap<String, String> decodeMap=new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
    	String str=UUID.randomUUID().toString();
        encodeMap.put(longUrl, str);
        decodeMap.put(str, longUrl);
        return str;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return decodeMap.get(shortUrl).toString();
    }
}

