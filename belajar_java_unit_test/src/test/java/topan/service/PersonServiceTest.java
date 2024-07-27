package topan.service;

import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import topan.data.Person;
import topan.repository.PersonRepository;

@Extensions({
    @ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {
  @Mock
  private PersonRepository personRepository;
  private PersonService personService;

  @BeforeEach
  void setUp() {
    personService = new PersonService(personRepository);
  }

  @Test
  public void testNotFound() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      personService.get("topan");
    });
  }

  @Test
  public void testGetPersonSuccess() {
    Mockito.when(personRepository.selectById("topan")).thenReturn(new Person("topan", "Topan"));

    var person = personService.get("topan");

    Assertions.assertNotNull(person);
  }

  @Test
  public void testRegisterSucces() {
    var person = personService.register("topan");
    Assertions.assertNotNull(person);
    Assertions.assertEquals("topan", person.getName());
    Assertions.assertNotNull(person.getId());

    Mockito.verify(personRepository, times(1)).insert(new Person(person.getId(), person.getName()));
  }
}
