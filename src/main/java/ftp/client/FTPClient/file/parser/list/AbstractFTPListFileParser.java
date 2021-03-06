package ftp.client.FTPClient.file.parser.list;

import ftp.client.FTPClient.file.FTPFile;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by a.kalenkevich on 22.02.2017.
 */
public abstract class AbstractFTPListFileParser implements FTPListFileParser {
    private Pattern pattern;
    private MatchResult result;
    String currentPathName;

    @Override
    public List<FTPFile> parse(List<String> entries) {
        List<FTPFile> files = new ArrayList<>();

        for (String entry: entries) {
            FTPFile ftpFile = parseEntry(entry);
            files.add(ftpFile);
        }

        return files;
    }

    protected abstract FTPFile parseEntry(String entry);

    AbstractFTPListFileParser(String regex, String currentPathName) {
        pattern = Pattern.compile(regex);
        this.currentPathName = currentPathName;
    }

    boolean isValidEntry(String entry) {
        result = null;
        Matcher matcher = pattern.matcher(entry);
        boolean isMatches = matcher.matches();

        if (isMatches) {
            result = matcher.toMatchResult();
        }

        return result != null;
    }

    String group(int matchnum) {
        return result == null ? null : result.group(matchnum);
    }
}