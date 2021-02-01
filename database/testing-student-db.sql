select * from course as c,teacher as t where c.teacher_id=t.id;
select * from course as c inner join teacher as t on c.teacher_id=t.id;
select * from course as c inner join teacher as t on c.teacher_id=t.id;

select * from course as c left join teacher as t on c.teacher_id=t.id;
select * from course as c right join teacher as t on c.teacher_id=t.id;

select * from student s inner join classes as cl on s.id = cl.student_id;
select * from student s inner join classes as cl on s.id = cl.student_id inner join course as cr on cl.course_id = cr.id;
select * from student s inner join classes as cl on s.id = cl.student_id inner join course as cr on cl.course_id = cr.id 
inner join teacher as t on cr.teacher_id=t.id;

select concat(s.firstname,' ',s.lastname) as student, s.age, cr.course_name, concat(t.firstName,' ', t.lastname) as teacher 
from student s inner join classes as cl on s.id = cl.student_id 
inner join course as cr on cl.course_id = cr.id 
inner join teacher as t on cr.teacher_id=t.id;

select concat(s.firstname,' ',s.lastname) as student, s.age, cr.course_name, concat(t.firstName,' ', t.lastname) as teacher 
from student s inner join classes as cl on s.id = cl.student_id 
inner join course as cr on cl.course_id = cr.id 
inner join teacher as t on cr.teacher_id=t.id
order by student;

select cr.course_name,count(*)
from student s inner join classes as cl on s.id = cl.student_id 
inner join course as cr on cl.course_id = cr.id 
inner join teacher as t on cr.teacher_id=t.id
group by cr.course_name;

