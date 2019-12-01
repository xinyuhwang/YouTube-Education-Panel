package youtube.service;

import youtube.model.Tag;

/*
 * Tag service interface to test tag add remove
 */
public interface TagService {
    void addTag(Tag tag);

    void removeTag(String tagName);

    //void removeAllTags(Tag tag);
}


