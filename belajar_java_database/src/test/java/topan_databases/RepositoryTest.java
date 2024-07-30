package topan_databases;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import topan_databases.entities.Comments;
import topan_databases.repositories.comments.CommentsRepository;
import topan_databases.repositories.comments.CommentsRepositoryImpl;

public class RepositoryTest {

  private CommentsRepository commentsRepository;

  @BeforeEach
  void setUp() {
    commentsRepository = new CommentsRepositoryImpl();
  }

  @Test
  void testInsert() {
    Comments comment = new Comments("topansidiq28@gmail.com", "Boleh juga!");
    commentsRepository.insert(comment);

    Assertions.assertNotNull(comment.getId());
    System.out.println(comment.getId());
  }

  @Test
  public void testFindById() {
    Comments comments = commentsRepository.findId(3502);
    Assertions.assertNotNull(comments);
    System.out.println(comments.getId());
    System.out.println(comments.getEmail());
    System.out.println(comments.getComment());
  }

  @Test
  public void testFindAll() {
    List<Comments> comments = commentsRepository.findAll();
    System.out.println(comments.size());
  }

  @Test
  public void testFindByEmail() {
    List<Comments> comments = commentsRepository.findAllByEmail("topansidiq28@gmail.com");

    comments.forEach(value -> {
      System.out.println(value.getComment());
    });
  }

  @Test
  public void testDeleteById() {
    commentsRepository.deleteComment(3507);
  }

  @Test
  public void testDeleteAllOfEmail() {
    commentsRepository.deleteAllCommentOfEmail("topansidiq28@gmail.com");
  }

  @Test
  public void testDeleteAll() {
    commentsRepository.deleteAllComments();
  }
}
