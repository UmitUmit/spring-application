CREATE OR REPLACE PROCEDURE update_department_toys(emp_id int)
language plpgsql
as
$$
begin
update employees set department='Toys'
where employee_id=emp_id;
commit;

end
        $$;

call update_department_toys(10);

select *
from employees
where employee_id=10;