create table mz_BatchSchedule (
	BatchSchedule_Id LONG not null primary key,
	batchcCat VARCHAR(75) null,
	batchName VARCHAR(75) null,
	batchteacher VARCHAR(75) null,
	batchTime VARCHAR(75) null,
	batchDay VARCHAR(75) null
);

create table mz_Courses (
	cId LONG not null primary key,
	cName VARCHAR(75) null,
	cCat VARCHAR(75) null,
	cDesc VARCHAR(75) null,
	cPreq VARCHAR(75) null,
	cDuration INTEGER
);

create table mz_EnrollCourse (
	eId LONG not null primary key,
	efName VARCHAR(75) null,
	egen VARCHAR(75) null,
	email VARCHAR(75) null,
	econt LONG,
	equal VARCHAR(75) null,
	ecourse VARCHAR(75) null,
	ebatch VARCHAR(75) null,
	estatus VARCHAR(75) null
);