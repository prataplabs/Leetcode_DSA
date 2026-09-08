class Solution {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        int[] mentions = new int[numberOfUsers];

        
        int[] offlineUntil = new int[numberOfUsers];

        
        events.sort((a, b) -> {
            int timeA = Integer.parseInt(a.get(1));
            int timeB = Integer.parseInt(b.get(1));

            if (timeA != timeB) {
                return Integer.compare(timeA, timeB);
            }

            if (a.get(0).equals(b.get(0))) {
                return 0;
            }

            return a.get(0).equals("OFFLINE") ? -1 : 1;
        });

        for (List<String> event : events) {

            String type = event.get(0);
            int time = Integer.parseInt(event.get(1));

            if (type.equals("OFFLINE")) {

                int id = Integer.parseInt(event.get(2));

                
                offlineUntil[id] = time + 60;

            } else {

                String message = event.get(2);

                if (message.equals("ALL")) {

                    
                    for (int i = 0; i < numberOfUsers; i++) {
                        mentions[i]++;
                    }

                } else if (message.equals("HERE")) {

                    
                    for (int i = 0; i < numberOfUsers; i++) {
                        if (offlineUntil[i] <= time) {
                            mentions[i]++;
                        }
                    }

                } else {

                    
                    String[] tokens = message.split(" ");

                    for (String token : tokens) {
                        if (token.startsWith("id")) {
                            int id = Integer.parseInt(token.substring(2));
                            mentions[id]++;
                        }
                    }
                }
            }
        }

        return mentions;
        
    }
}