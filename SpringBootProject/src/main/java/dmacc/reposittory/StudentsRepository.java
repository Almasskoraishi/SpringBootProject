/**
 *@auther [user} amkoraishi@dmacc.edu
 *CIS175-Fal2022
 *Oct 17, 2022
  */
package dmacc.reposittory;
import org.springframework.stereotype.Repository;

import dmacc.beans.Student;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Student, Long> {

}