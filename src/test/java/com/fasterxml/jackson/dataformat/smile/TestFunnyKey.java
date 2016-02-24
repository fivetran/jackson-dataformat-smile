package com.fasterxml.jackson.dataformat.smile;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.IOException;

public class TestFunnyKey extends SmileTestBase {
    public void testFunnyKey() throws IOException {
        String base64EncodedSmile = "OikKA/j6NChWTEFOKSBEYXlzIG9mIHRoZSB3ZWVrIGlzIG1lbWJlciBhdmFpbGFibGUgZm9yIHRoaXMgd29yaz/8Ifv5";
        byte[] smile = Base64Variants.MIME.decode(base64EncodedSmile);

        System.out.println(new String(smile));

        ArrayNode array = smileMapper().readValue(smile, ArrayNode.class);

        System.out.println(array);
    }
}
