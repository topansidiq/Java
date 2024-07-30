package topan_databases.repositories.comments;

import java.util.List;

import topan_databases.entities.Comments;

public interface CommentsRepository {

  void insert(Comments comment);

  void deleteAllComments();

  void deleteComment(Integer id);

  void deleteAllCommentOfEmail(String email);

  Comments findId(Integer id);

  List<Comments> findAll();

  List<Comments> findAllByEmail(String email);

}
