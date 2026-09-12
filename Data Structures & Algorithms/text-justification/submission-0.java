class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        int line = 0;

        for (String word : words) {
            if (line + word.length() + (line == 0 ? 0 : 1) > maxWidth) {
                result.add(builder.toString());
                justifyLine(result, maxWidth, false);
                builder = new StringBuilder();
                line = 0;
            }

            if (line != 0) {
                builder.append(" ");
                line++;
            }

            builder.append(word);
            line += word.length();
        }

        if (builder.length() > 0) {
            result.add(builder.toString());
            justifyLine(result, maxWidth, true);
        }

        return result;
    }

    public void justifyLine(List<String> result, int maxWidth, boolean isLastLine) {
        String joined = result.get(result.size() - 1);
        String[] wordsInLine = joined.split(" ");
        int numWords = wordsInLine.length;

        int totalWordLength = 0;
        for (String w : wordsInLine) {
            totalWordLength += w.length();
        } 

        StringBuilder line = new StringBuilder();

        if (isLastLine || numWords == 1) {
            for (int i = 0; i < numWords; i++) {
                line.append(wordsInLine[i]);
                if (i < numWords - 1) {
                    line.append(" ");
                }
            }
            while (line.length() < maxWidth) {
                line.append(" ");
            }
        } else {
            int gaps = numWords - 1;
            int totalSpaces = maxWidth - totalWordLength;
            int base = totalSpaces / gaps;
            int extra = totalSpaces % gaps;

            for (int i = 0; i < numWords; i++) {
                line.append(wordsInLine[i]);
                if (i < gaps) {
                    int spacesHere = base + (i < extra ? 1 : 0);
                    for (int s = 0; s < spacesHere; s++) {
                        line.append(" ");
                    }
                }
            }
        }
        result.remove(result.size() - 1);
        result.add(line.toString());
    }
}